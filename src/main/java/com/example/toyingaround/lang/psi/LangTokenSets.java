package com.example.toyingaround.lang.psi;

import com.intellij.psi.tree.TokenSet;

public class LangTokenSet {
    TokenSet IDENTIFIERS = TokenSet.create(LangTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(LangTypes.COMMENT);
}
