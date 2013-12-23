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

public class ExerciseIntermediate extends Activity {

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
        title.setText("INTERMEDIATE");
        soal.setText("1.\tRumus luas segitiga adalah ...");
        radioButton.setText("0.5 x (sisi AB + sisi CD) x tinggi");
        radioButton1.setText("0.7 x (sisi AB + sisi CD) x tinggi");
        radioButton2.setText("0.5 x (sisi AB + sisi CD)");

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
            soal.setText("2.\tRumus keliling layang-layang adalah ...");
            radioButton.setText("2 x (AB + DC)");
            radioButton1.setText("(2 x AB) + (2 x BC)");
            radioButton2.setText("2 x (AB x DC)");
        } else if (page == 3) {
            soal.setText("3.\tRumus volume tabung adalah ...");
            radioButton.setText("1/3 x phi x r x r x t");
            radioButton1.setText("Phi x r x r x t");
            radioButton2.setText("Phi x r x t");
        } else if (page == 4) {
            soal.setText("4.\t30 kg = ... g");
            radioButton.setText("300");
            radioButton1.setText("3000");
            radioButton2.setText("30.000");
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

        if (temp.getText().toString().equals("0.5 x (sisi AB + sisi CD) x tinggi")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("2 x (AB + DC)")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("Phi x r x r x t")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("30.000")) {
            nilai = nilai + 25;
        }
    }
}

