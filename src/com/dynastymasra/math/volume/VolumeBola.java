package com.dynastymasra.math.volume;

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

public class VolumeBola extends Activity {

    private EditText editText;
    private Button buttonNext, buttonBack;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.volume_bola);

        editText = (EditText)findViewById(R.id.editTextVolumeBola);
        buttonBack = (Button)findViewById(R.id.buttonVolumeBola);
        buttonNext = (Button)findViewById(R.id.buttonVolumeBola1);
        textView = (TextView)findViewById(R.id.textViewVolumeBola);

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
        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(VolumeBola.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = (4.0/3.0) * 3.14 * Math.pow(Double.valueOf(editText.getText().toString()), 3);
            textView.setText("" + hasil);
        }
    }
}
