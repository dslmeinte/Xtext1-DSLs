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

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.MessagePage;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.PageBookView;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class StatsView extends PageBookView {
	MessagePage defaultPage;

	@Override
	protected IPage createDefaultPage(PageBook book) {
		defaultPage = new MessagePage();
		initPage(defaultPage);
		defaultPage.setMessage("No VHDL editor active");
		defaultPage.createControl(getPageBook()); 
		return defaultPage;
	}

	@Override
	protected PageRec doCreatePage(IWorkbenchPart part) {
		StatsPage statsPage = new StatsPage((XtextEditor) part); 
		initPage(statsPage);
		statsPage.createControl(getPageBook()); 
		return new PageRec(part, statsPage);
	}

	@Override
	protected void doDestroyPage(IWorkbenchPart part, PageRec pageRecord) {
		pageRecord.page.dispose();
	}

	@Override
	protected IWorkbenchPart getBootstrapPart() {
		IWorkbenchPage page = getSite().getPage();
		if (page != null) {
			// check whether the active part is important to us
			IWorkbenchPart activePart = page.getActivePart();
			return isImportant(activePart) ? activePart : null;
		}
		return null;
	}

	@Override
	protected boolean isImportant(IWorkbenchPart part) {
		if (part instanceof XtextEditor) {
			return true;
		}

		return false;
	}

	@Override
	public void dispose() {
		defaultPage.dispose();
		super.dispose();
	}
}
