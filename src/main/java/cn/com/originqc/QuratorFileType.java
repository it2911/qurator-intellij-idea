package cn.com.originqc;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.io.File;

public class QuratorFileType extends LanguageFileType {
    Logger logger = LoggerFactory.getLogger(QuratorFileType.class);

    public static final QuratorFileType INSTANCE = new QuratorFileType();
    @NonNls
    public static final String DEFAULT_EXTENSION = "qrunes";
    @NonNls public static final String DOT_DEFAULT_EXTENSION = "."+DEFAULT_EXTENSION;

    private QuratorFileType() {
        super(QuratorLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Qurators";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "qurators.files.file.type.description";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return QuratorIcons.FILE;
    }
}
