package com.dynastymasra.math.luas;

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

public class LuasExample extends Activity {

    private Button buttonNext, buttonBack;
    private ImageView imageView;
    private TextView textView;
    private Integer number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.luas_ket);

        buttonNext = (Button) findViewById(R.id.buttonLuasNext);
        buttonBack = (Button) findViewById(R.id.buttonLuasBack);
        imageView = (ImageView) findViewById(R.id.imageViewLuas);
        textView = (TextView)findViewById(R.id.textViewLuasKet);

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

    public void view() {
        Intent intent = getIntent();
        String item = intent.getStringExtra("item");

        if (item.equalsIgnoreCase("Belah Ketupat")) {
            textView.setText(item);
            imageView.setImageResource(R.drawable.ket_belah_ketupat);
            number = 1;
        } else if (item.equalsIgnoreCase("Jajar Genjang")) {
            textView.setText(item);
            imageView.setImageResource(R.drawable.jajar_genjang);
            number = 2;
        } else if (item.equalsIgnoreCase("Lingkaran")) {
            textView.setText(item);
            imageView.setImageResource(R.drawable.uraian_lingkaran);
            number = 3;
        } else if (item.equalsIgnoreCase("Persegi")) {
            textView.setText(item);
            imageView.setImageResource(R.drawable.uraian_persegi);
            number = 4;
        } else if (item.equalsIgnoreCase("Persegi Panjang")) {
            textView.setText(item);
            imageView.setImageResource(R.drawable.uraian_persegi_panjang);
            number = 5;
        } else if (item.equalsIgnoreCase("Segitiga")) {
            textView.setText(item);
            imageView.setImageResource(R.drawable.uraian_segitiga);
            number = 6;
        } else if (item.equalsIgnoreCase("Trapesium")) {
            textView.setText(item);
            imageView.setImageResource(R.drawable.uraian_trapesium);
            number = 7;
        }
    }

    public void intent() {
        if (number == 1) {
            Intent intent = new Intent(LuasExample.this, BelahKetupat.class);
            startActivity(intent);
        } else if (number == 2) {
            Intent intent = new Intent(LuasExample.this, JajarGenjang.class);
            startActivity(intent);
        } else if (number == 3) {
            Intent intent = new Intent(LuasExample.this, Lingkaran.class);
            startActivity(intent);
        } else if (number == 4) {
            Intent intent = new Intent(LuasExample.this, Persegi.class);
            startActivity(intent);
        } else if (number == 5) {
            Intent intent = new Intent(LuasExample.this, PersegiPanjang.class);
            startActivity(intent);
        } else if (number == 6) {
            Intent intent = new Intent(LuasExample.this, Segitiga.class);
            startActivity(intent);
        } else if (number == 7) {
            Intent intent = new Intent(LuasExample.this, Trapesium.class);
            startActivity(intent);
        }
    }
}
