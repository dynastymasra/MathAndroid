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

public class KelilingLingkaran extends Activity {

    private Button buttonNext, buttonBack;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.keliling_lingkaran);

        buttonBack = (Button) findViewById(R.id.buttonKelilingLingkaran);
        buttonNext = (Button) findViewById(R.id.buttonKelilingLingkaran1);
        textView = (TextView) findViewById(R.id.textViewKelilingLingkaran);
        editText = (EditText) findViewById(R.id.editTextKelilingLingkaran);

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
        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(KelilingLingkaran.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = 2 * 3.14 * Double.valueOf(editText.getText().toString());
            textView.setText("" + hasil);
        }
    }
}
