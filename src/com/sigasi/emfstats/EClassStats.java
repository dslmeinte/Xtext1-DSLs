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

import org.eclipse.emf.ecore.EClass;

public class EClassStats {
	private EClass c;

	private long instanceCount;
	
	public EClassStats(EClass c) {
		this.instanceCount = 0;
		this.c = c; 
	}

	public void increment () {
		++ instanceCount; 
	}
	
	public void increment (long count) {
		instanceCount += count; 
	}
	
	public long getInstanceCount (){
		return instanceCount;
	}
	
	public long getFeatureCount (){
		return c.getFeatureCount(); 
	}
	
	public long getFeatureLoad (){
		return getFeatureCount() * getInstanceCount(); 
	}
	
	@Override
	public String toString() {
		return Long.toString(instanceCount) + " " + Long.toString (getFeatureCount()); 
	}

	public String getName() {
		return c.getName();
	}
}
