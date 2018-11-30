package com.arangodb.intellij.aql.grammar.custom.psi;

import com.intellij.psi.impl.PsiImplUtil;

public final class AqlPsiUtil {
    private AqlPsiUtil() {
    }

    //############################################
    // BNF used methods
    //############################################
    public static String getName(final AqlNamedElement element) {
        return element.getText();
    }

    public static String getFunctionName(final AqlNamedElement element) {
        final String name = element.getText();
        final int idx = name.indexOf('(');
        if (idx > 0) {
            return name.substring(0, idx);
        }
        return name;
    }

    public static AqlNamedElement setName(final AqlNamedElement element, final String newName) {
        PsiImplUtil.setName(element, newName);
        return element;
    }

}
