package pe.centeno.appcalifica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

String webURL="https://consultorrc.000webhostapp.com/index.html";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.WebView);



        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
      ///  myWebView.loadUrl("https://consultorrc.000webhostapp.com/index.html");
  /*      if (savedInstanceState != null)
        {
            myWebView.loadUrl(webURL);
        }
*/


        if (savedInstanceState != null) {
            myWebView.restoreState(savedInstanceState);
        } else {
            myWebView.loadUrl(webURL);
        }

    }




}
