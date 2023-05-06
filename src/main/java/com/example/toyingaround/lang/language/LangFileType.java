package com.example.toyingaround.lang.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class LangFileType extends LanguageFileType {
    public static final LangFileType INSTANCE = new LangFileType();

    protected LangFileType() {
        super(LangLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "MCLang";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Minecraft localization";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "lang";
    }

    @Override
    public Icon getIcon() {
        return null;
    }
}
