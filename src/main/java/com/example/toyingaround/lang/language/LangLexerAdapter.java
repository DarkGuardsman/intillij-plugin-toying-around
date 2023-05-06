package com.example.toyingaround.lang.language;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class LangLexerAdapter extends FlexAdapter {
    public LangLexerAdapter() {
        super(new LangLexer(null));
    }
}
