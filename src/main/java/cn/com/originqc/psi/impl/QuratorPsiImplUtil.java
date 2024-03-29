package cn.com.originqc.psi.impl;

import cn.com.originqc.QuratorIcons;
import cn.com.originqc.psi.QuratorElementFactory;
import cn.com.originqc.psi.QuratorProperty;
import cn.com.originqc.psi.QuratorTypes;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class QuratorPsiImplUtil {
    public static String getKey(QuratorProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(QuratorTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(QuratorProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(QuratorTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(QuratorProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(QuratorProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(QuratorTypes.KEY);
        if (keyNode != null) {
            QuratorProperty property = QuratorElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(QuratorProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(QuratorTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final QuratorProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return QuratorIcons.FILE;
            }
        };
    }
}
