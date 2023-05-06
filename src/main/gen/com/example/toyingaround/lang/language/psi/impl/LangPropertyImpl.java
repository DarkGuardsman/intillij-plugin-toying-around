// This is a generated file. Not intended for manual editing.
package com.example.toyingaround.lang.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.toyingaround.lang.psi.LangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.example.toyingaround.lang.language.psi.*;

public class LangPropertyImpl extends ASTWrapperPsiElement implements LangProperty {

  public LangPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LangVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LangVisitor) accept((LangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LangPropertyValue getPropertyValue() {
    return findChildByClass(LangPropertyValue.class);
  }

}
