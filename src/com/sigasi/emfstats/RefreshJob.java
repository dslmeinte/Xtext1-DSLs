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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.collect.Maps;
import com.sigasi.hdt.vhdl.ui.internal.VhdlUiActivator;

public class RefreshJob extends Job {

	private final class RefreshWork implements
			IUnitOfWork<Map<EClass, EClassStats>, XtextResource> {
		private final IProgressMonitor monitor;

		private RefreshWork(IProgressMonitor monitor) {
			this.monitor = monitor;
		}

		public Map<EClass, EClassStats> exec(XtextResource resource) throws Exception {
			HashMap<EClass, EClassStats> stats = Maps.newHashMap();

			if (resource != null) {
				TreeIterator<EObject> allContents = resource.getAllContents();

				long count = 0;
				while (allContents.hasNext()) {
					count++;
					if (count % 10000 == 0 && monitor.isCanceled()) {
						return stats;
					}
					EObject next = allContents.next();

					updateStats(stats, next);
				}
			}

			return stats;
		}

		private void updateStats(HashMap<EClass, EClassStats> stats, EObject object) {
			EClass c = object.eClass();

			EClassStats counter = null;

			if (!stats.containsKey(c)) {
				counter = new EClassStats(c);
				stats.put(c, counter);
			} else {
				counter = stats.get(c);
			}

			counter.increment();
		}
	}

	private StatsPage emfStatsView;

	public RefreshJob(StatsPage emfStatsView) {
		super("Refreshing EMF stats");
		this.emfStatsView = emfStatsView;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			Map<EClass, EClassStats> newEmfStats = refreshEmfStats(monitor);

			if (!monitor.isCanceled()) {
				emfStatsView.setStats(newEmfStats);
			}

			return Status.OK_STATUS;
		} catch (Throwable t) {
			return new Status(IStatus.ERROR, VhdlUiActivator.ID,
					"Error refreshing EMF stats", t);
		}
	}

	protected Map<EClass, EClassStats> refreshEmfStats(final IProgressMonitor monitor) {
		Map<EClass, EClassStats> newEmfStats = emfStatsView.getXtextDocument()
				.readOnly(new RefreshWork(monitor));
		return newEmfStats;
	}
}
