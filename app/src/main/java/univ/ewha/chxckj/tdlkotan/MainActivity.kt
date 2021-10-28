package univ.ewha.chxckj.tdlkotan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private var backPressed:Long = -1;
    override fun onBackPressed() {
        if (System.currentTimeMillis() - backPressed < 2000) {
            finish()
        } else {
            backPressed = System.currentTimeMillis()
        }
    }
}