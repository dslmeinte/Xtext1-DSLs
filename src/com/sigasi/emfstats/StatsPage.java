/*******************************************************************************
 * Copyright (c) 2011 Sigasi N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sigasi N.V.: Mark Christiaens - initial API and implementation
 *******************************************************************************/

package com.sigasi.emfstats;

import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.Page;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;

public class StatsPage extends Page {
	private final class SortSelectionAdapter extends SelectionAdapter {
		private final TableColumn tblclmnInstanceCount;
		private final TableViewer tableViewer;
		private int columnNumber;

		private SortSelectionAdapter(TableColumn tblclmnInstanceCount,
				TableViewer tableViewer, int columnNumber) {
			this.tblclmnInstanceCount = tblclmnInstanceCount;
			this.tableViewer = tableViewer;
			this.columnNumber = columnNumber;
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			StatsComparator comparator2 = (StatsComparator) tableViewer.getComparator();
			comparator2.setColumn(columnNumber);
			int dir = table.getSortDirection();
			if (table.getSortColumn() == tblclmnInstanceCount) {
				dir = dir == SWT.UP ? SWT.DOWN : SWT.UP;
			} else {
				dir = SWT.DOWN;
			}
			table.setSortDirection(dir);
			table.setSortColumn(tblclmnInstanceCount);
			tableViewer.refresh();
		}
	}

	private static final Logger logger = Logger.getLogger(StatsPage.class);
	
	private Composite control;
	private Table table;
	private RefreshJob refreshJob;
	private IXtextDocument xtextDocument;
	private IXtextModelListener modelListener;

	private TableViewer tableViewer;

	private Label lblInfo;

	/**
	 * Create the PageBookView Page.
	 */
	public StatsPage(XtextEditor xtextEditor) {
		refreshJob = new RefreshJob(this);
		xtextDocument = xtextEditor.getDocument();
		configureModelListener();
		scheduleRefresh (); 
	}
	
	public void scheduleRefresh() {
		refreshJob.cancel();
		refreshJob.schedule();
	}
	
	protected void configureModelListener() {
		modelListener = new IXtextModelListener() {
			public void modelChanged(XtextResource resource) {
				try {
					scheduleRefresh();
				} catch (Throwable t) {
					logger.error("Error refreshing EMF statistics", t);
				}
			}

		};
		xtextDocument.addModelListener(modelListener);
	}
	
	/**
	 * Create contents of the PageBookView Page.
	 * @param parent
	 */
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		control = container;
		container.setLayout(new GridLayout(1, false));
		{
			this.tableViewer = new TableViewer(container, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
			table = tableViewer.getTable();
			table.setLinesVisible(true);
			table.setHeaderVisible(true);
			table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			{
				final TableColumn tblclmnClassName = new TableColumn(table, SWT.LEFT);
				tblclmnClassName.addSelectionListener(new SortSelectionAdapter(tblclmnClassName, tableViewer, 0));
				tblclmnClassName.setWidth(400);
				tblclmnClassName.setText("Class name");
			}
			{
				final TableColumn tblclmnInstanceCount = new TableColumn(table, SWT.LEFT);
				tblclmnInstanceCount.addSelectionListener(new SortSelectionAdapter(tblclmnInstanceCount, tableViewer, 1));
				tblclmnInstanceCount.setWidth(200);
				tblclmnInstanceCount.setText("Instance count");
			}
			{
				final TableColumn tblclmnFeatureCount = new TableColumn(table, SWT.LEFT);
				tblclmnFeatureCount.addSelectionListener(new SortSelectionAdapter(tblclmnFeatureCount, tableViewer, 2));
				tblclmnFeatureCount.setWidth(200);
				tblclmnFeatureCount.setText("Feature count");
			}
			{
				final TableColumn tblclmnFeatureLoad = new TableColumn(table, SWT.LEFT);
				tblclmnFeatureLoad.addSelectionListener(new SortSelectionAdapter(tblclmnFeatureLoad, tableViewer, 3));
				tblclmnFeatureLoad.setWidth(200);
				tblclmnFeatureLoad.setText("Feature load");
			}
			tableViewer.setLabelProvider(new TableLabelProvider());
			tableViewer.setContentProvider(new ArrayContentProvider());
			tableViewer.setComparator(new StatsComparator()); 
		}
		{
			this.lblInfo = new Label(container, SWT.WRAP);
			GridData gd_lblInfo = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
			gd_lblInfo.minimumWidth = 400;
			lblInfo.setLayoutData(gd_lblInfo);
			lblInfo.setText("Total number of instances");
		}
	}

	@Override
	public Control getControl() {
		return control;
	}

	@Override
	public void init(IPageSite pageSite) {
		super.init(pageSite);
		createActions();
		initializeToolBar();
		initializeMenu();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
//		IToolBarManager toolbarManager = getSite().getActionBars()
//				.getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
//		IMenuManager menuManager = getSite().getActionBars().getMenuManager();
	}
	
	private static long getTotalInstances(Map<EClass, EClassStats> newEmfStats) {
		long total = 0;
		
		Collection<EClassStats> values = newEmfStats.values();
		for (EClassStats stats : values) {
			total += stats.getInstanceCount();
		}
		
		return total; 
	}

	public IXtextDocument getXtextDocument() {
		return xtextDocument;
	}
	
	public void setStats(final Map<EClass, EClassStats> newEmfStats) {
//		System.err.println("Setting new state of EmfStatsView");
		Display display = Display.getDefault();
		
		final Object[] array = newEmfStats.values().toArray();
		
		display.asyncExec(new Runnable() {
			public void run() {
				tableViewer.setInput(array); 
			}
		});
		
		final long totalInstances = getTotalInstances (newEmfStats); 
		
		display.asyncExec(new Runnable() {
			public void run() {
				lblInfo.setText("Total number of instances: " + totalInstances);  
			}
		});
		
	}

}
