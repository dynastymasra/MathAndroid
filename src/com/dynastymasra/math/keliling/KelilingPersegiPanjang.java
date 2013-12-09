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

public class KelilingPersegiPanjang extends Activity {

    private Button buttonNext, buttonBack;
    private TextView textView;
    private EditText panjang, lebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.keliling_persegi_panjang);

        buttonNext = (Button)findViewById(R.id.buttonKelilingPersegiPanjang1);
        buttonBack = (Button)findViewById(R.id.buttonKelilingPersegiPanjang);
        textView = (TextView)findViewById(R.id.textViewKelilingPersegiPanjang1);
        panjang = (EditText)findViewById(R.id.editTextKelilingPersegiPanjang);
        lebar = (EditText)findViewById(R.id.editTextKelilingPersegiPanjang1);

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
        if (panjang.getText().toString().isEmpty() || lebar.getText().toString().isEmpty()) {
            Toast.makeText(KelilingPersegiPanjang.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = 4 * (Double.valueOf(panjang.getText().toString()) + Double.valueOf(lebar.getText().toString()));
            textView.setText("" + hasil);
        }
    }
}
