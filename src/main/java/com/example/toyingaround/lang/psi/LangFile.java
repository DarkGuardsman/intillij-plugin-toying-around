package com.example.toyingaround.lang.psi;

import com.example.toyingaround.lang.language.LangFileType;
import com.example.toyingaround.lang.language.LangLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class LangFile extends PsiFileBase {
    public LangFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, LangLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return LangFileType.INSTANCE;
    }
}
