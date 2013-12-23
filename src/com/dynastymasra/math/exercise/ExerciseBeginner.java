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

public class ExerciseBeginner extends Activity {

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
        title.setText("Beginner");
        soal.setText("1.\tLuas lingkaran = phi x r x r\n\t Nilai phi = ...");
        radioButton.setText("2.14");
        radioButton1.setText("6.28");
        radioButton2.setText("3.14");

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
            soal.setText("2.\tRumus keliling persegi adalah ...");
            radioButton.setText("Sisi x Sisi");
            radioButton1.setText("4 x Sisi");
            radioButton2.setText("Panjang x Lebar");
        } else if (page == 3) {
            soal.setText("3.\tUntuk satuan ukuran panjang, konversi dari suatu tingkat menjadi satu tingkat dibawahnya adalah ...");
            radioButton.setText("Dikali dengan 100");
            radioButton1.setText("Dikali dengan 10");
            radioButton2.setText("Dibagi dengan 10");
        } else if (page == 4) {
            soal.setText("4.\tRumus luas lingkaran adalah ...");
            radioButton.setText("1/3 x phi x r x tinggi");
            radioButton1.setText("Panjang x Lebar");
            radioButton2.setText("phi x r x r");
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

        if (temp.getText().toString().equals("3.14")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("4 x Sisi")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("Dikali dengan 10")) {
            nilai = nilai + 25;
        } else if (temp.getText().toString().equals("phi x r x r")) {
            nilai = nilai + 25;
        }
    }
}
