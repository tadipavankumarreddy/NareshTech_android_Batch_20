package `in`.nareshtechnologies.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        Log.v("MAIN","onStart() method is called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("MAIN","onCreate() method is called")
    }

    override fun onResume() {
        super.onResume()
        Log.v("MAIN","onResume() method is called")
    }

    override fun onPause() {
        super.onPause()
        Log.v("MAIN","onPause() method is called")
    }

    override fun onStop() {
        super.onStop()
        Log.v("MAIN","onStop() method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("MAIN","onDestroy() method is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("MAIN","onRestart() method is called")
    }
}
