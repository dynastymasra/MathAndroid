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

public class VolumeBalok extends Activity {

    private Button buttonNext, buttonBack;
    private TextView textView;
    private EditText panjang, lebar, tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.volume_balok);

        buttonBack = (Button) findViewById(R.id.buttonVolumeBalok);
        buttonNext = (Button) findViewById(R.id.buttonVolumeBalok1);
        textView = (TextView) findViewById(R.id.textViewVolumeBalok);
        panjang = (EditText) findViewById(R.id.editTextVolumeBalok);
        lebar = (EditText) findViewById(R.id.editTextVolumeBalok1);
        tinggi = (EditText) findViewById(R.id.editTextVolumeBalok2);

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
        if (panjang.getText().toString().isEmpty() || lebar.getText().toString().isEmpty() || tinggi.getText().toString().isEmpty()) {
            Toast.makeText(VolumeBalok.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = Double.valueOf(panjang.getText().toString()) * Double.valueOf(lebar.getText().toString()) * Double.valueOf(tinggi.getText().toString());
            BigDecimal bigDecimal = new BigDecimal(hasil);
            bigDecimal = bigDecimal.setScale(5, BigDecimal.ROUND_HALF_UP);
            hasil = bigDecimal.doubleValue();
            textView.setText("" + hasil);
        }
    }
}
