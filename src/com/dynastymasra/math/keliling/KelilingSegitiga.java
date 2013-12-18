package com.dynastymasra.math.keliling;

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

public class KelilingSegitiga extends Activity {

    private Button buttonNext, buttonBack;
    private TextView textView;
    private EditText panjangAB, panjangBC, panjangAC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.keliling_segitiga);

        buttonBack = (Button) findViewById(R.id.buttonKelilingSegitiga);
        buttonNext = (Button) findViewById(R.id.buttonKelilingSegitiga1);
        textView = (TextView) findViewById(R.id.textViewKelilingSegitiga);
        panjangAB = (EditText) findViewById(R.id.editTextKelilingSegitiga);
        panjangBC = (EditText) findViewById(R.id.editTextKelilingSegitiga1);
        panjangAC = (EditText) findViewById(R.id.editTextKelilingSegitiga2);

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
        if (panjangAB.getText().toString().isEmpty() || panjangBC.getText().toString().isEmpty() || panjangAC.getText().toString().isEmpty()) {
            Toast.makeText(KelilingSegitiga.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = Double.valueOf(panjangAB.getText().toString()) + Double.valueOf(panjangBC.getText().toString()) + Double.valueOf(panjangAC.getText().toString());
            BigDecimal bigDecimal = new BigDecimal(hasil);
            bigDecimal = bigDecimal.setScale(5, BigDecimal.ROUND_HALF_UP);
            hasil = bigDecimal.doubleValue();
            textView.setText("" + hasil);
        }
    }
}
