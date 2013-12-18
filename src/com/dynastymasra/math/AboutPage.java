package com.dynastymasra.math;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.dynastymasra.math.R;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class AboutPage extends Activity {

    private Button button, button2;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.about_us);

        button = (Button) findViewById(R.id.buttonAbout1);
        button2 = (Button) findViewById(R.id.buttonAbout2);
        imageView = (ImageView) findViewById(R.id.imageViewAbout);

        button2.setVisibility(View.INVISIBLE);
        imageView.setImageResource(R.drawable.about_hal_2);
        button.setText("Page 1");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To change body of implemented methods use File | Settings | File Templates.
                finish();
            }
        });
    }
}
