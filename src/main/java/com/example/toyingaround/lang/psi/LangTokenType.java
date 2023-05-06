package com.example.toyingaround.lang.psi;

import com.example.toyingaround.lang.language.LangLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class LangTokenType extends IElementType {
    public LangTokenType(@NonNls @NotNull String debugName) {
        super(debugName, LangLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "LangTokenType." + super.toString();
    }
}
