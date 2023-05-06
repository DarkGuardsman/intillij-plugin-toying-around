package com.example.toyingaround.lang.language.highlight;

import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;

public class SimpleSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

  @NotNull
  @Override
  public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
    return new SimpleSyntaxHighlighter();
  }

}