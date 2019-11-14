package cn.com.originqc.psi;

import cn.com.originqc.QuratorFileType;
import cn.com.originqc.QuratorLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuratorTokenType extends IElementType {
    Logger logger = LoggerFactory.getLogger(QuratorTokenType.class);

    public QuratorTokenType(@NotNull String debugName) {
        super(debugName, QuratorLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "QuratorTokenType." + super.toString();
    }
}
