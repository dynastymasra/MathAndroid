package com.dynastymasra.math;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class AboutUs extends Activity {

    private Button buttonBack, buttonPage2;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.about_us);

        buttonBack = (Button) findViewById(R.id.buttonAbout1);
        buttonPage2 = (Button) findViewById(R.id.buttonAbout2);
        imageView = (ImageView) findViewById(R.id.imageViewAbout);

        imageView.setImageResource(R.drawable.about_hal_1);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                finish();
            }
        });
        buttonPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To change body of implemented methods use File | Settings | File Templates.
                Intent intent = new Intent(AboutUs.this, AboutPage.class);
                startActivity(intent);
            }
        });
    }
}
