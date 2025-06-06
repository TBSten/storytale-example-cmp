import androidx.compose.ui.window.ComposeUIViewController
import me.tbsten.example.storytale.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
