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

public class KelilingLayangLayang extends Activity {

    private Button buttonNext, buttonBack;
    private EditText panjangAB, panjangDC;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.keliling_layang_layang);

        buttonBack = (Button) findViewById(R.id.buttonKelilingLayangLayang);
        buttonNext = (Button) findViewById(R.id.buttonKelilingLayangLayang1);
        panjangAB = (EditText) findViewById(R.id.editTextKelilingLayangLayang);
        panjangDC = (EditText) findViewById(R.id.editTextKelilingLayangLayang1);
        textView = (TextView) findViewById(R.id.textViewKelilingLayangLayang1);

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
        if (panjangAB.getText().toString().isEmpty() || panjangDC.getText().toString().isEmpty()) {
            Toast.makeText(KelilingLayangLayang.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = 2 * (Double.valueOf(panjangAB.getText().toString()) + Double.valueOf(panjangDC.getText().toString()));
            textView.setText("" + hasil);
        }
    }
}
