package cn.com.originqc.psi.impl;

import cn.com.originqc.psi.QuratorElementType;
import cn.com.originqc.psi.QuratorNamedElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class QuratorNamedElementImpl extends ASTWrapperPsiElement implements QuratorNamedElement {

    public QuratorNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
