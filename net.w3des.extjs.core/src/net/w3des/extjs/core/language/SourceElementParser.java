/*******************************************************************************
 * Copyright (c) 20013 w3des.net and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *      w3des.net - initial API and implementation
 ******************************************************************************/
package net.w3des.extjs.core.language;

import net.w3des.extjs.core.ExtJSNature;

import org.eclipse.dltk.core.AbstractSourceElementParser;

public class SourceElementParser extends AbstractSourceElementParser {
	@Override
	protected String getNatureId() {
		return ExtJSNature.NATURE_ID;
	}

}
