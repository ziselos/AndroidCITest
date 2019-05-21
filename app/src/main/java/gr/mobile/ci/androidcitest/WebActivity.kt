package gr.mobile.ci.androidcitest

import android.app.Activity
import android.net.Uri
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    //private val webView : WebView by bind(R.id.webView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        loadWebPage()
    }

    fun buildUri(authority: String): Uri {
        val builder = Uri.Builder()
        builder.scheme("https")
            .authority(authority)
        return builder.build()
    }

    fun loadWebPage() {
        webView.loadUrl("")
        val uri: Uri
        try {
            uri = buildUri(Definitions.WEB_URL)
            webView.loadUrl(uri.toString())
        } catch (e: UnsupportedOperationException) {
            e.printStackTrace()
        }
    }

    fun <T: View> Activity.bind(@IdRes res : Int) : Lazy<T> {
        @Suppress("UNCHECKED_CAST")
        return unsafeLazy { findViewById(res) as T }
    }

    // for custom views
    fun <T : View> View.bind(@IdRes idRes: Int): Lazy<T> {
        @Suppress("UNCHECKED_CAST")
        return unsafeLazy { findViewById(idRes) as T }
    }

    private fun <T> unsafeLazy(initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)
}