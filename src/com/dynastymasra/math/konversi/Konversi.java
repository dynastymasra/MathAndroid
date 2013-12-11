package com.dynastymasra.math.konversi;

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

public class Konversi extends Activity {

    private Button buttonNext, buttonBack;
    private ImageView imageView;
    private TextView textView;
    private String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.konversi);

        buttonBack = (Button) findViewById(R.id.buttonKonversi);
        buttonNext = (Button) findViewById(R.id.buttonKonversi1);
        textView = (TextView) findViewById(R.id.textViewKonversi);
        imageView = (ImageView) findViewById(R.id.imageViewKonversi);

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
        item = intent.getStringExtra("item");

        if (item.equalsIgnoreCase("Konversi Panjang")) {
            imageView.setImageResource(R.drawable.uraian_konversi_panjang);
            textView.setText(item);
        } else if (item.equalsIgnoreCase("Konversi Berat")) {
            imageView.setImageResource(R.drawable.uraian_konversi_berat);
            textView.setText(item);
        } else if (item.equalsIgnoreCase("Konversi Volume")) {
            imageView.setImageResource(R.drawable.uraian_konversi_volume);
            textView.setText(item);
        } else if (item.equalsIgnoreCase("Konversi Suhu")) {
            imageView.setImageResource(R.drawable.uraian_konversi_suhu);
            textView.setText(item);
        }
    }

    private void intent() {
        if (item.equalsIgnoreCase("Konversi Panjang")) {
            Intent intent = new Intent(Konversi.this, KonversiHitung.class);
            intent.putExtra("item", item);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Konversi Berat")) {
            Intent intent = new Intent(Konversi.this, KonversiHitung.class);
            intent.putExtra("item", item);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Konversi Volume")) {
            Intent intent = new Intent(Konversi.this, KonversiHitung.class);
            intent.putExtra("item", item);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Konversi Suhu")) {
            Intent intent = new Intent(Konversi.this, KonversiHitung.class);
            intent.putExtra("item", item);
            startActivity(intent);
        }
    }
}
