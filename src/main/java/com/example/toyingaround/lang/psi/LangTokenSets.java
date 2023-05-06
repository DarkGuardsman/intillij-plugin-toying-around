package com.example.toyingaround.lang.psi;

import com.intellij.psi.tree.TokenSet;

public interface LangTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(LangTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(LangTypes.COMMENT);
}
