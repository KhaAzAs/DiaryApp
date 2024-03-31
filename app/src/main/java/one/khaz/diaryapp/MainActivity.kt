package one.khaz.diaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import io.realm.kotlin.mongodb.App
import one.khaz.diaryapp.navigation.Screen
import one.khaz.diaryapp.navigation.SetupNavGraph
import one.khaz.diaryapp.ui.theme.DiaryAppTheme
import one.khaz.diaryapp.util.Constants.APP_ID

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            DiaryAppTheme {
                val navController = rememberNavController()
                SetupNavGraph(
                    startDestination = getStartDestination(),
                    navController = navController
                )
            }
        }
    }
}

private fun getStartDestination(): String {
    val user = App.create(APP_ID).currentUser
    return  if (user != null && user.loggedIn) Screen.Home.route
    else Screen.Authentication.route
}