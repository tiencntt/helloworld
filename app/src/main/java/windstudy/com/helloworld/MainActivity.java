package windstudy.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imgBack, imgNext, imgReload;
    EditText edtURL;
    Button btnSearch;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        webView.setWebViewClient(new WebViewClient());
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String
            }
        });
    }
    public void Anhxa(){
        imgBack = findViewById(R.id.imageButtonBack);
        imgNext = findViewById(R.id.imageButtonNext);
        imgReload = findViewById(R.id.imageButtonReload);
        edtURL = findViewById(R.id.edt_URL);
        btnSearch = findViewById(R.id.buttonSearch);
        webView = findViewById(R.id.webview);
    }
}
