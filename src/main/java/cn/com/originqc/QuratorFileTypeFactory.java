package cn.com.originqc;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuratorFileTypeFactory extends FileTypeFactory {
    Logger logger = LoggerFactory.getLogger(QuratorFileTypeFactory.class);

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(QuratorFileType.INSTANCE);
    }
}
