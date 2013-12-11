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

public class Segitiga extends Activity {

    private Button buttonNext, buttonBack;
    private EditText editTextAlas, editTextTinggi;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.luas_segitiga);

        buttonBack = (Button) findViewById(R.id.buttonLuasSegitiga2);
        buttonNext = (Button) findViewById(R.id.buttonLuasSegitiga1);
        textView = (TextView) findViewById(R.id.luasSegitigaTextView1);
        editTextAlas = (EditText) findViewById(R.id.editTextLuasSegitiga1);
        editTextTinggi = (EditText) findViewById(R.id.luasSegitigaEditView2);

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
        if (editTextAlas.getText().toString().isEmpty() || editTextTinggi.getText().toString().isEmpty()) {
            Toast.makeText(Segitiga.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = 0.5 * Double.valueOf(editTextAlas.getText().toString()) * Double.valueOf(editTextTinggi.getText().toString());
            textView.setText("" + hasil);
        }
    }
}
