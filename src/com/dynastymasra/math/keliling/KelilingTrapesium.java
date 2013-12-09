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

public class KelilingTrapesium extends Activity {

    private Button buttonNext, buttonBack;
    private EditText panjangAB, panjangBC, panjangCD, panjangDA;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.keliling_trapesium);

        buttonBack = (Button)findViewById(R.id.buttonKelilingTrapesium);
        buttonNext = (Button)findViewById(R.id.buttonKelilingTrapesium1);
        panjangAB = (EditText)findViewById(R.id.editTextKelilingTrapesium);
        panjangBC = (EditText)findViewById(R.id.editTextKelilingTrapesium1);
        panjangCD = (EditText)findViewById(R.id.editTextKelilingTrapesium2);
        panjangDA = (EditText)findViewById(R.id.editTextKelilingTrapesium3);
        textView = (TextView)findViewById(R.id.textViewKelilingTrapesium);

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
        if (panjangAB.getText().toString().isEmpty() || panjangDA.getText().toString().isEmpty() || panjangCD.getText().toString().isEmpty() || panjangBC.getText().toString().isEmpty()) {
            Toast.makeText(KelilingTrapesium.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = Double.valueOf(panjangAB.getText().toString()) + Double.valueOf(panjangBC.getText().toString()) + Double.valueOf(panjangCD.getText().toString()) + Double.valueOf(panjangDA.getText().toString());
            textView.setText("" + hasil);
        }
    }
}
