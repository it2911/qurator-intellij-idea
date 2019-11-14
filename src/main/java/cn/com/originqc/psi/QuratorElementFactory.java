package cn.com.originqc.psi;

import cn.com.originqc.QuratorFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;

public class QuratorElementFactory {
    public static QuratorProperty createProperty(Project project, String name, String value) {
        final QuratorFile file = createFile(project, name + " = " + value);
        return (QuratorProperty) file.getFirstChild();
    }

    public static QuratorProperty createProperty(Project project, String name) {
        final QuratorFile file = createFile(project, name);
        return (QuratorProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final QuratorFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

    public static QuratorFile createFile(Project project, String text) {
        String name = "dummy.qurator";
        return (QuratorFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, QuratorFileType.INSTANCE, text);
    }
}
