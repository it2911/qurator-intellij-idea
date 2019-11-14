package cn.com.originqc.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class QuratorLexerAdapter extends FlexAdapter {

    public QuratorLexerAdapter() {
        super(new QuratorLexer((Reader) null));
    }
}
