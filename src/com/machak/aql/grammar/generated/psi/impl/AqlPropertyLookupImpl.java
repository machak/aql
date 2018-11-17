// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.AqlPropertyKeyName;
import com.machak.aql.grammar.generated.psi.AqlPropertyLookup;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;

public class AqlPropertyLookupImpl extends ASTWrapperPsiElement implements AqlPropertyLookup {

  public AqlPropertyLookupImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitPropertyLookup(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) {
      accept((AqlVisitor) visitor);
    } else {
      super.accept(visitor);
    }
  }

  @Override
  @NotNull
  public AqlPropertyKeyName getPropertyKeyName() {
    return findNotNullChildByClass(AqlPropertyKeyName.class);
  }

}