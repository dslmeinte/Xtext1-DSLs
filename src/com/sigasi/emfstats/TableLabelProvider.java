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

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class TableLabelProvider extends LabelProvider implements
		ITableLabelProvider {
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof EClassStats) {
			EClassStats stats = (EClassStats) element;

			switch (columnIndex) {
			case 0:
				return stats.getName();
			case 1:
				return Long.toString(stats.getInstanceCount());
			case 2:
				return Long.toString(stats.getFeatureCount());
			case 3:
				return Long.toString(stats.getFeatureLoad());
			}

			return "There are only 4 columns (index 0 to 3)";
		}

		return "Row should have Stats type";
	}
}
