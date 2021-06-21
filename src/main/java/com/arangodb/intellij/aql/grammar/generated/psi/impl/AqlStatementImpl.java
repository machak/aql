// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;

public class AqlStatementImpl extends ASTWrapperPsiElement implements AqlStatement {

  public AqlStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlArrayRef getArrayRef() {
    return findChildByClass(AqlArrayRef.class);
  }

  @Override
  @Nullable
  public AqlComment getComment() {
    return findChildByClass(AqlComment.class);
  }

  @Override
  @Nullable
  public AqlForType getForType() {
    return findChildByClass(AqlForType.class);
  }

  @Override
  @Nullable
  public AqlJsonType getJsonType() {
    return findChildByClass(AqlJsonType.class);
  }

  @Override
  @Nullable
  public AqlLetType getLetType() {
    return findChildByClass(AqlLetType.class);
  }

  @Override
  @Nullable
  public AqlReturnType getReturnType() {
    return findChildByClass(AqlReturnType.class);
  }

}
