// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlArrayRef;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlComplexJsonValue;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlJsonType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlObjectExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlParameterVariable;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlStringType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVariablePlaceHolder;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

public class AqlJsonTypeImpl extends ASTWrapperPsiElement implements AqlJsonType {

  public AqlJsonTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitJsonType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlArrayRef> getArrayRefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlArrayRef.class);
  }

  @Override
  @NotNull
  public List<AqlComplexJsonValue> getComplexJsonValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlComplexJsonValue.class);
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
  public List<AqlStringType> getStringTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlStringType.class);
  }

  @Override
  @NotNull
  public List<AqlVariablePlaceHolder> getVariablePlaceHolderList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlVariablePlaceHolder.class);
  }

}
