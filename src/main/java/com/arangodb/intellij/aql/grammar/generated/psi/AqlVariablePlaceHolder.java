// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.navigation.ItemPresentation;

public interface AqlVariablePlaceHolder extends PsiElement {

  @NotNull
  AqlObjectExpression getObjectExpression();

  String getName();

  AqlNamedElement setName(String newName);

  ItemPresentation getPresentation();

}
