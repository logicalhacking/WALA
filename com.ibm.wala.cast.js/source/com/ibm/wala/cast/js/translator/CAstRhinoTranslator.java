/******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *****************************************************************************/
package com.ibm.wala.cast.js.translator;

import java.io.IOException;
import java.io.Reader;

import com.ibm.wala.cast.ir.translator.TranslatorToIR;
import com.ibm.wala.cast.js.loader.JavaScriptLoader;
import com.ibm.wala.cast.tree.impl.CAstImpl;
import com.ibm.wala.classLoader.*;

public class CAstRhinoTranslator extends TranslatorBase {
    private final JSAstTranslator CAstToIR;

    public void translate(ModuleEntry M, String N) throws IOException {
      CAstToIR.translate(
        new RhinoToAstTranslator(new CAstImpl(), M, N).translate(),
	N);
    }

    public CAstRhinoTranslator(JavaScriptLoader loader) {
      this.CAstToIR = new JSAstTranslator(loader);
    }

}
