package cn.com.originqc;

import cn.com.originqc.psi.QuratorFile;
import cn.com.originqc.psi.QuratorProperty;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuratorUtil {

    public static List<QuratorProperty> findProperties(Project project, String key) {
        List<QuratorProperty> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, QuratorFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            QuratorFile quratorFile = (QuratorFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (quratorFile != null) {
                QuratorProperty[] properties = PsiTreeUtil.getChildrenOfType(quratorFile, QuratorProperty.class);
                if (properties != null) {
                    for (QuratorProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<QuratorProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<QuratorProperty>emptyList();
    }

    public static List<QuratorProperty> findProperties(Project project) {
        List<QuratorProperty> result = new ArrayList<QuratorProperty>();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, QuratorFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            QuratorFile quratorFile = (QuratorFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (quratorFile != null) {
                QuratorProperty[] properties = PsiTreeUtil.getChildrenOfType(quratorFile, QuratorProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
