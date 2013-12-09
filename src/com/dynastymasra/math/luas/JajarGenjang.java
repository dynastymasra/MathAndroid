package com.dynastymasra.math.luas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.dynastymasra.math.R;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class JajarGenjang extends Activity {

    private EditText alas, tinggi;
    private Button buttonBack, buttonNext;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.jajar_genjang);

        alas = (EditText) findViewById(R.id.alasJajarGenjang);
        tinggi = (EditText) findViewById(R.id.tinggiJajarGenjang);
        buttonBack = (Button) findViewById(R.id.kembaliJajarGenjangi);
        buttonNext = (Button) findViewById(R.id.hitungJajarGenjang);
        textView = (TextView) findViewById(R.id.hasilJajarGenjang);

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
                hitung();
            }
        });
    }

    public void hitung() {
        if (alas.getText().toString().isEmpty() || tinggi.getText().toString().isEmpty()) {
            Toast.makeText(JajarGenjang.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double luas = Double.valueOf(alas.getText().toString()) * Double.valueOf(tinggi.getText().toString());
            textView.setText("" + luas);
        }
    }
}
