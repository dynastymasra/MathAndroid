package com.dynastymasra.math.exercise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.dynastymasra.math.R;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class ExerciseAdvanced extends Activity {

    private TextView title, soal, result;
    private Button button;
    private Integer page = 1;
    private Integer nilai = 0;
    private RadioButton radioButton, radioButton1, radioButton2, temp;
    private RadioGroup radio;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.exercise);

        title = (TextView) findViewById(R.id.textViewExercise);
        result = (TextView) findViewById(R.id.textView1Exercise);
        soal = (TextView) findViewById(R.id.textViewExercise1);
        button = (Button) findViewById(R.id.buttonExercise);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radio = (RadioGroup) findViewById(R.id.radioGroup);

        result.setVisibility(View.INVISIBLE);
        title.setText("ADVANCED");
        soal.setText("1.\tBerapakah volume bola jika diketahui r = 30 ?");
        radioButton.setText("300");
        radioButton1.setText("120.500");
        radioButton2.setText("113.040");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To change body of implemented methods use File | Settings | File Templates.
                nilaiC();
                page++;
                exercise();
            }
        });
    }

    private void exercise() {
        if (page == 2) {
            soal.setText("2.\tBerapa keliling jajar genjang jika diketahui panjang AB = 14 & BC = 15 ?");
            radioButton.setText("58");
            radioButton1.setText("68");
            radioButton2.setText("78");
        } else if (page == 3) {
            soal.setText("3.\t0.5 hl = ... L");
            radioButton.setText("500");
            radioButton1.setText("5");
            radioButton2.setText("50");
        } else if (page == 4) {
            soal.setText("4.\t40 C = ... F");
            radioButton.setText("221");
            radioButton1.setText("104");
            radioButton2.setText("204");
            button.setText("Close");
        } else if (page == 5) {
            soal.setVisibility(View.INVISIBLE);
            radioButton1.setVisibility(View.INVISIBLE);
            radioButton.setVisibility(View.INVISIBLE);
            radioButton2.setVisibility(View.INVISIBLE);
            result.setVisibility(View.VISIBLE);
            result.setText("" + nilai);
        } else if (page == 6) {
            finish();
        }
    }

    private void nilaiC() {
        int selected = radio.getCheckedRadioButtonId();
        temp = (RadioButton) findViewById(selected);

        if (temp.getText().toString().equals("113.040")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("58")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("50")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("104")) {
            nilai = nilai + 25;
        }
    }
}
