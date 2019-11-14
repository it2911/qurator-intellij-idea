package cn.com.originqc.completion;

import cn.com.originqc.QuratorLanguage;
import cn.com.originqc.psi.QuratorTypes;
import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class QuratorCompletionContributor extends CompletionContributor {
    public QuratorCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(QuratorTypes.VALUE).withLanguage(QuratorLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("Hello"));
                    }
                }
        );
    }
}
