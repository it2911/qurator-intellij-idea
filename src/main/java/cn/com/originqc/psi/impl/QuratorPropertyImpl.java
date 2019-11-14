// This is a generated file. Not intended for manual editing.
package cn.com.originqc.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cn.com.originqc.psi.QuratorTypes.*;
import cn.com.originqc.psi.*;
import com.intellij.navigation.ItemPresentation;

public class QuratorPropertyImpl extends QuratorNamedElementImpl implements QuratorProperty {

  public QuratorPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QuratorVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QuratorVisitor) accept((QuratorVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return QuratorPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return QuratorPsiImplUtil.getValue(this);
  }

  @Override
  public String getName() {
    return QuratorPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return QuratorPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return QuratorPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return QuratorPsiImplUtil.getPresentation(this);
  }

}
