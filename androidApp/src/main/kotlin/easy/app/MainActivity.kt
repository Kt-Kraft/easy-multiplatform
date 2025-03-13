package easy.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import org.koin.androidx.compose.KoinAndroidContext
import shared.Main

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    val splashScreen = installSplashScreen()
    super.onCreate(savedInstanceState)

    splashScreen.setKeepOnScreenCondition {
      false
    }

    enableEdgeToEdge(
      SystemBarStyle.dark(getColor(R.color.background)),
      SystemBarStyle.dark(getColor(R.color.background)),
    )

    setContent {
      KoinAndroidContext { Main() }
    }
  }
}
