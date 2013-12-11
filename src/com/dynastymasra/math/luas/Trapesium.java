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

public class Trapesium extends Activity {

    private EditText panjangAB, panjangCD, tinggi;
    private TextView textView;
    private Button buttonNext, buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.luas_trapesium);

        panjangAB = (EditText) findViewById(R.id.editTextLuasTrapesium);
        panjangCD = (EditText) findViewById(R.id.editText1LuasTrapesium);
        tinggi = (EditText) findViewById(R.id.editText2LuasTrapesium);
        textView = (TextView) findViewById(R.id.textView2LuasTrapesium);
        buttonBack = (Button) findViewById(R.id.button1LuasTrapesium);
        buttonNext = (Button) findViewById(R.id.buttonLuasTrapesium);

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
        if (panjangCD.getText().toString().isEmpty() || panjangAB.getText().toString().isEmpty() || tinggi.getText().toString().isEmpty()) {
            Toast.makeText(Trapesium.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = 0.5 * (Double.valueOf(panjangAB.getText().toString()) + Double.valueOf(panjangCD.getText().toString())) * Double.valueOf(tinggi.getText().toString());
            textView.setText("" + hasil);
        }
    }
}
