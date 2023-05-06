package com.example.toyingaround.lang.psi;

import com.example.toyingaround.lang.language.LangLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class LangElementType extends IElementType {
    public LangElementType(@NonNls @NotNull String debugName) {
        super(debugName, LangLanguage.INSTANCE);
    }
}
