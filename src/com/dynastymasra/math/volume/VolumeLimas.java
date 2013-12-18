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

public class VolumeLimas extends Activity {

    private Button buttonNext, buttonBack;
    private EditText alas, tinggi;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.volume_limas);

        buttonBack = (Button) findViewById(R.id.buttonVolumeLimas);
        buttonNext = (Button) findViewById(R.id.buttonVolumeLimas1);
        alas = (EditText) findViewById(R.id.editTextVolumeLimas);
        tinggi = (EditText) findViewById(R.id.editTextVolumeLimas1);
        textView = (TextView) findViewById(R.id.textViewVolumeLimas);

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

    private void hitung() {
        if (alas.getText().toString().isEmpty() || tinggi.getText().toString().isEmpty()) {
            Toast.makeText(VolumeLimas.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = (1.0 / 3.0) * Double.valueOf(alas.getText().toString()) * Double.valueOf(tinggi.getText().toString());
            BigDecimal bigDecimal = new BigDecimal(hasil);
            bigDecimal = bigDecimal.setScale(5, BigDecimal.ROUND_HALF_UP);
            hasil = bigDecimal.doubleValue();
            textView.setText("" + hasil);
        }
    }
}
