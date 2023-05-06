// This is a generated file. Not intended for manual editing.
package com.example.toyingaround.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.toyingaround.lang.language.psi.impl.*;

public interface LangTypes {

  IElementType PROPERTY = new LangElementType("PROPERTY");
  IElementType PROPERTY_VALUE = new LangElementType("PROPERTY_VALUE");

  IElementType COLOR_CODE = new LangTokenType("COLOR_CODE");
  IElementType COMMENT = new LangTokenType("COMMENT");
  IElementType CRLF = new LangTokenType("CRLF");
  IElementType KEY = new LangTokenType("KEY");
  IElementType SEPARATOR = new LangTokenType("SEPARATOR");
  IElementType WHITE_SPACE = new LangTokenType("WHITE_SPACE");
  IElementType WORD = new LangTokenType("WORD");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new LangPropertyImpl(node);
      }
      else if (type == PROPERTY_VALUE) {
        return new LangPropertyValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
