// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunReverse;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlNumberType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlObjectExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlParameterVariable;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlPropertyName;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlQueryItem;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlStringType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVariablePlaceHolder;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_REVERSE;

public class AqlFunReverseImpl extends ASTWrapperPsiElement implements AqlFunReverse {

  public AqlFunReverseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunReverse(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlNumberType> getNumberTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlNumberType.class);
  }

  @Override
  @NotNull
  public List<AqlObjectExpression> getObjectExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlObjectExpression.class);
  }

  @Override
  @NotNull
  public List<AqlParameterVariable> getParameterVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlParameterVariable.class);
  }

  @Override
  @NotNull
  public List<AqlPropertyName> getPropertyNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlPropertyName.class);
  }

  @Override
  @NotNull
  public List<AqlQueryItem> getQueryItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlQueryItem.class);
  }

  @Override
  @Nullable
  public AqlStringType getStringType() {
    return findChildByClass(AqlStringType.class);
  }

  @Override
  @NotNull
  public List<AqlVariablePlaceHolder> getVariablePlaceHolderList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlVariablePlaceHolder.class);
  }

  @Override
  @Nullable
  public PsiElement getFReverse() {
    return findChildByType(F_REVERSE);
  }

}
