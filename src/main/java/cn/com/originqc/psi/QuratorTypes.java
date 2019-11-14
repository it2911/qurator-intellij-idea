// This is a generated file. Not intended for manual editing.
package cn.com.originqc.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cn.com.originqc.psi.impl.*;

public interface QuratorTypes {

  IElementType PROPERTY = new QuratorElementType("PROPERTY");

  IElementType COMMENT = new QuratorTokenType("COMMENT");
  IElementType KEY = new QuratorTokenType("KEY");
  IElementType SEPARATOR = new QuratorTokenType("SEPARATOR");
  IElementType VALUE = new QuratorTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new QuratorPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
