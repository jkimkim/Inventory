package app.web.jkimtech.inventory

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.firebase.ui.auth.AuthUI
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {
    private val SPLASH_SCREEN_DELAY = 3000L // 3000 milliseconds = 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logo = findViewById<ImageView>(R.id.logo)
        val pulseAnimation = AnimationUtils.loadAnimation(this, R.anim.pulse_anim)
        logo.startAnimation(pulseAnimation)

        // Delay for 3 seconds and then start MainActivity
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN_DELAY)

    }
}
