package com.dynastymasra.math.volume;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.dynastymasra.math.R;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class VolumeExample extends Activity {

    private Button buttonBack, buttonNext;
    private TextView textView;
    private ImageView imageView;
    private Integer number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.volume);

        buttonBack = (Button) findViewById(R.id.buttonVolume);
        buttonNext = (Button) findViewById(R.id.buttonVolume1);
        textView = (TextView) findViewById(R.id.textViewVolume);
        imageView = (ImageView) findViewById(R.id.imageViewVolume);

        view();

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                finish();
            }
        });
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                intent();
            }
        });
    }

    private void view() {
        Intent intent = getIntent();
        String item = intent.getStringExtra("item");

        if (item.equalsIgnoreCase("Balok")) {
            imageView.setImageResource(R.drawable.uraian_balok);
            textView.setText(item);
            number = 1;
        } else if (item.equalsIgnoreCase("Bola")) {
            imageView.setImageResource(R.drawable.uraian_volume_bola);
            textView.setText(item);
            number = 2;
        } else if (item.equalsIgnoreCase("Kerucut")) {
            imageView.setImageResource(R.drawable.uraian_volume_kerucut);
            textView.setText(item);
            number = 3;
        } else if (item.equalsIgnoreCase("Kubus")) {
            imageView.setImageResource(R.drawable.uraian_volume_kubus);
            textView.setText(item);
            number = 4;
        } else if (item.equalsIgnoreCase("Limas")) {
            imageView.setImageResource(R.drawable.uraian_volume_limas);
            textView.setText(item);
            number = 5;
        } else if (item.equalsIgnoreCase("Tabung")) {
            imageView.setImageResource(R.drawable.uraian_volume_tabung);
            textView.setText(item);
            number = 6;
        }
    }

    private void intent() {
        if (number == 1) {
            Intent intent = new Intent(VolumeExample.this, VolumeBalok.class);
            startActivity(intent);
        } else if (number == 2) {
            Intent intent = new Intent(VolumeExample.this, VolumeBola.class);
            startActivity(intent);
        } else if (number == 3) {
            Intent intent = new Intent(VolumeExample.this, VolumeKerucut.class);
            startActivity(intent);
        } else if (number == 4) {
            Intent intent = new Intent(VolumeExample.this, VolumeKubus.class);
            startActivity(intent);
        } else if (number == 5) {
            Intent intent = new Intent(VolumeExample.this, VolumeLimas.class);
            startActivity(intent);
        } else if (number == 6) {
            Intent intent = new Intent(VolumeExample.this, VolumeTabung.class);
            startActivity(intent);
        }
    }
}
