package cn.com.originqc.psi;

import cn.com.originqc.QuratorLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QuratorElementType extends IElementType {

    public QuratorElementType(@NotNull String debugName) {
        super(debugName, QuratorLanguage.INSTANCE);
    }
}
