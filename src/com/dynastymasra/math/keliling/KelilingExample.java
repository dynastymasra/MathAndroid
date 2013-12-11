package com.dynastymasra.math.keliling;

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

public class KelilingExample extends Activity {

    private TextView textView;
    private ImageView imageView;
    private Button buttonNext, buttonBack;
    private Integer number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.keliling);

        textView = (TextView) findViewById(R.id.textViewKeliling);
        imageView = (ImageView) findViewById(R.id.imageViewKeliling);
        buttonBack = (Button) findViewById(R.id.buttonKeliling);
        buttonNext = (Button) findViewById(R.id.buttonKeliling1);

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

        if (item.equalsIgnoreCase("Jajar Genjang")) {
            imageView.setImageResource(R.drawable.uraian_keliling_jajar_genjang);
            textView.setText(item);
            number = 1;
        } else if (item.equalsIgnoreCase("Layang-layang")) {
            imageView.setImageResource(R.drawable.uraian_keliling_layang_layang);
            textView.setText(item);
            number = 2;
        } else if (item.equalsIgnoreCase("Lingkaran")) {
            imageView.setImageResource(R.drawable.uraian_keliling_lingkaran);
            textView.setText(item);
            number = 3;
        } else if (item.equalsIgnoreCase("Persegi Panjang")) {
            imageView.setImageResource(R.drawable.uraian_keliling_persegi_panjang);
            textView.setText(item);
            number = 4;
        } else if (item.equalsIgnoreCase("Persegi")) {
            imageView.setImageResource(R.drawable.uraian_keliling_persegi);
            textView.setText(item);
            number = 5;
        } else if (item.equalsIgnoreCase("Segitiga")) {
            imageView.setImageResource(R.drawable.uraian_keliling_segitiga);
            textView.setText(item);
            number = 6;
        } else if (item.equalsIgnoreCase("Trapesium")) {
            imageView.setImageResource(R.drawable.uraian_keliling_trapesium);
            textView.setText(item);
            number = 7;
        }
    }

    public void intent() {
        if (number == 1) {
            Intent intent = new Intent(KelilingExample.this, KelilingJajarGenjang.class);
            startActivity(intent);
        } else if (number == 2) {
            Intent intent = new Intent(KelilingExample.this, KelilingLayangLayang.class);
            startActivity(intent);
        } else if (number == 3) {
            Intent intent = new Intent(KelilingExample.this, KelilingLingkaran.class);
            startActivity(intent);
        } else if (number == 4) {
            Intent intent = new Intent(KelilingExample.this, KelilingPersegiPanjang.class);
            startActivity(intent);
        } else if (number == 5) {
            Intent intent = new Intent(KelilingExample.this, KelilingPersegi.class);
            startActivity(intent);
        } else if (number == 6) {
            Intent intent = new Intent(KelilingExample.this, KelilingSegitiga.class);
            startActivity(intent);
        } else if (number == 7) {
            Intent intent = new Intent(KelilingExample.this, KelilingTrapesium.class);
            startActivity(intent);
        }
    }
}
