package com.example.toyingaround.lang.language;

import com.example.toyingaround.lang.language.parser.LangParser;
import com.example.toyingaround.lang.psi.LangFile;
import com.example.toyingaround.lang.psi.LangTokenSets;
import com.example.toyingaround.lang.psi.LangTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class LangParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(LangLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new LangLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return LangTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new LangParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new LangFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return LangTypes.Factory.createElement(node);
    }
}
