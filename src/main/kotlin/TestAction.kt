import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import org.jetbrains.kotlin.psi.KtPsiFactory

class TestAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val factory = KtPsiFactory(e.project)
        val comment = factory.createComment("Hello World")

        val psiFile = e.getData(CommonDataKeys.PSI_FILE)
        psiFile?.add(comment)
    }
}
