package com.dynastymasra.math.volume;

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

public class VolumeKerucut extends Activity {

    private Button buttonNext, buttonBack;
    private TextView textView;
    private EditText panjang, tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.volume_kerucut);

        buttonBack = (Button) findViewById(R.id.buttonVolumeKerucut);
        buttonNext = (Button) findViewById(R.id.buttonVolumeKerucut1);
        textView = (TextView) findViewById(R.id.textViewVolumeKerucut);
        panjang = (EditText) findViewById(R.id.editTextVolumeKerucut);
        tinggi = (EditText) findViewById(R.id.editTextVolumeKerucut1);

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

    private void hitung() {
        if (panjang.getText().toString().isEmpty() || tinggi.getText().toString().isEmpty()) {
            Toast.makeText(VolumeKerucut.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = (1.0 / 3.0) * 3.14 * Math.pow(Double.valueOf(panjang.getText().toString()), 2) * Double.valueOf(tinggi.getText().toString());
            BigDecimal bigDecimal = new BigDecimal(hasil);
            bigDecimal = bigDecimal.setScale(5, BigDecimal.ROUND_HALF_UP);
            hasil = bigDecimal.doubleValue();
            textView.setText("" + hasil);
        }
    }
}
