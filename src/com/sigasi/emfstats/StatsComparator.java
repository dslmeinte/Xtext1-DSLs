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

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

public class StatsComparator extends ViewerComparator {
	private int columnToSort;
	private static final int DESCENDING = 1;
	private int direction = DESCENDING;

	public StatsComparator() {
		this.columnToSort = 0;
		direction = DESCENDING;
	}

	public void setColumn(int column) {
		if (column == this.columnToSort) {
			// Same column as last sort; toggle the direction
			direction = 1 - direction;
		} else {
			// New column; do an ascending sort
			this.columnToSort = column;
			direction = DESCENDING;
		}
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		int rc = 0;
		EClassStats s1 = (EClassStats) e1;
		EClassStats s2 = (EClassStats) e2;
		
		switch (columnToSort) {
		case 0:
		{
			String name1 = s1.getName ();
			String name2 = s2.getName (); 
			rc = name1.compareTo(name2); 
			break;
		}
		
		case 1:{
			long l1 = s1.getInstanceCount(); 
			long l2 = s2.getInstanceCount();
			rc = Long.valueOf(l1).compareTo(Long.valueOf(l2));   
			break;
		}
		
		case 2:{
			long l1 = s1.getFeatureCount(); 
			long l2 = s2.getFeatureCount(); 
			rc = Long.valueOf(l1).compareTo(Long.valueOf(l2)); 
			break;
		}
		
		case 3:{
			long l1 = s1.getFeatureLoad(); 
			long l2 = s2.getFeatureLoad(); 
			rc = Long.valueOf(l1).compareTo(Long.valueOf(l2)); 
			break;
		}
		
		default:
			rc = 0;
		}
		
		// If descending order, flip the direction
		if (direction == DESCENDING) {
			rc = -rc;
		}
		return rc;
	}
}