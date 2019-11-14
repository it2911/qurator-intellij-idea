package cn.com.originqc;

import com.intellij.lang.Language;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuratorLanguage extends Language {
    Logger logger = LoggerFactory.getLogger(QuratorLanguage.class);
    public static final QuratorLanguage INSTANCE = new QuratorLanguage();

    private QuratorLanguage() {
        super("Qurator");
    }
}
