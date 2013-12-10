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

public class VolumeKubus extends Activity {

    private Button buttonNext, buttonBack;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.volume_kubus);

        buttonBack = (Button)findViewById(R.id.buttonVolumeKubus);
        buttonNext = (Button)findViewById(R.id.buttonVolumeKubus1);
        textView = (TextView)findViewById(R.id.textViewVolumeKubus);
        editText = (EditText)findViewById(R.id.editTextVolumeKubus);

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
            Toast.makeText(VolumeKubus.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            Double hasil = Double.valueOf(editText.getText().toString()) * Double.valueOf(editText.getText().toString()) * Double.valueOf(editText.getText().toString());
            textView.setText("" + hasil);
        }
    }
}
