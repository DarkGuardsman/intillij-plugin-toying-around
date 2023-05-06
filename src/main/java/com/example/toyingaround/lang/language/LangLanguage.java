package com.example.toyingaround.lang.language;

import com.intellij.lang.Language;

public class LangLanguage extends Language {
    public static final Language INSTANCE = new LangLanguage();
    protected LangLanguage() {
        super("MCLang");
    }
}
