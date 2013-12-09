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

public class BelahKetupat extends Activity {

    private EditText luasAC, luasBD;
    private Button buttonBack, buttonNext;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.belah_ketupat);

        luasAC = (EditText) findViewById(R.id.editTextBelahKetupatAC);
        luasBD = (EditText) findViewById(R.id.editTextBelahKetupatBD);
        buttonBack = (Button) findViewById(R.id.buttonBelahKetupatHitungKembali);
        buttonNext = (Button) findViewById(R.id.buttonBelahKetupatHitung);
        textView = (TextView) findViewById(R.id.textViewHasilBelahKetupat);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                hitung();
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                finish();
            }
        });

    }

    public void hitung() {
        if (luasAC.getText().toString().isEmpty() || luasBD.getText().toString().isEmpty()) {
            Toast.makeText(BelahKetupat.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = 0.5 * Double.valueOf(luasAC.getText().toString()) * Double.valueOf(luasBD.getText().toString());
            textView.setText("" + hasil);
        }
    }
}
