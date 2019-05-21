package gr.mobile.ci.androidcitest

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.TranslateAnimation
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import android.opengl.ETC1.getHeight



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        webViewTextView.setOnClickListener {
//            val intent = Intent(this, WebActivity::class.java)
//            startActivity(intent)
            //slideUpAnimation()
           val intent = Intent(this, HtmlActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


   private fun slideUpAnimation() {
       slideFrameLayout.visibility = View.VISIBLE
       val animate = TranslateAnimation(
           0f, // fromXDelta
           0f, // toXDelta
           slideFrameLayout.height.toFloat(), // fromYDelta
           0f
       )                // toYDelta
       animate.duration = 500
       animate.fillAfter = true
       slideFrameLayout.startAnimation(animate)
    }
}
