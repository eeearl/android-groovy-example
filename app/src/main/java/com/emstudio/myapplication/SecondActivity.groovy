package com.emstudio.myapplication
import android.app.Activity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import groovy.transform.CompileStatic
/**
 * Created by HanulPark on 3/9/15.
 */
@CompileStatic
public class SecondActivity extends Activity {

    String text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        def layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT)

        def textView = new TextView(this)
        textView.setText("Next Activity")
        textView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT))

        setContentView(textView, layoutParams)
    }
}
