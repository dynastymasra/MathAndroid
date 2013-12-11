package com.dynastymasra.math.keliling;

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

public class KelilingJajarGenjang extends Activity {

    private Button buttonNext, buttonBack;
    private TextView textView;
    private EditText panjangAB, panjangBC;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.keliling_jajar_genjang);

        buttonBack = (Button) findViewById(R.id.buttonKelilingJajarGenjang);
        buttonNext = (Button) findViewById(R.id.buttonKelilingJajarGenjang1);
        textView = (TextView) findViewById(R.id.textViewKelilingJajarGenjang1);
        panjangAB = (EditText) findViewById(R.id.editTextKelilingJajarGenjang);
        panjangBC = (EditText) findViewById(R.id.editTextKelilingJajarGenjang1);

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
        if (panjangBC.getText().toString().isEmpty() || panjangAB.getText().toString().isEmpty()) {
            Toast.makeText(KelilingJajarGenjang.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = (2 * Double.valueOf(panjangAB.getText().toString()) + (2 * Double.valueOf(panjangBC.getText().toString())));
            textView.setText("" + hasil);
        }
    }
}
