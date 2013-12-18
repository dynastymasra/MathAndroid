package com.dynastymasra.math.luas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.dynastymasra.math.R;

import java.math.BigDecimal;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class PersegiPanjang extends Activity {

    private Button buttonBack, buttonNext;
    private EditText panjang, lebar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.persegi_panjang);

        panjang = (EditText) findViewById(R.id.editTextPersegiPanjang);
        lebar = (EditText) findViewById(R.id.editText1PersegiPanjang);
        textView = (TextView) findViewById(R.id.textView1PersegiPanjang);
        buttonBack = (Button) findViewById(R.id.button1PersegiPanjang);
        buttonNext = (Button) findViewById(R.id.buttonPersegiPanjang);

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
        if (panjang.getText().toString().isEmpty() || lebar.getText().toString().isEmpty()) {
            Toast.makeText(PersegiPanjang.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = Double.valueOf(panjang.getText().toString()) * Double.valueOf(lebar.getText().toString());
            BigDecimal bigDecimal = new BigDecimal(hasil);
            bigDecimal = bigDecimal.setScale(5, BigDecimal.ROUND_HALF_UP);
            hasil = bigDecimal.doubleValue();
            textView.setText("" + hasil);
        }
    }
}
