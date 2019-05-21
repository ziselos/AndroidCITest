package gr.mobile.ci.androidcitest

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.text.Html
import kotlinx.android.synthetic.main.activity_html.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.toolbar
import kotlinx.android.synthetic.main.content_main.*

class HtmlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html)
        setSupportActionBar(toolbar)

        initLayout()


        }


    @RequiresApi(Build.VERSION_CODES.N)
    private fun initLayout() {
        //htmlText.text = Html.fromHtml(, Html.FROM_HTML_MODE_COMPACT)
    }
}