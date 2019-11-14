package cn.com.originqc.psi;

import cn.com.originqc.QuratorFileType;
import cn.com.originqc.QuratorLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class QuratorFile extends PsiFileBase {

    public QuratorFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, QuratorLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return QuratorFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Qurator File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
