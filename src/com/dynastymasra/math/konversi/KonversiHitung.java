package com.dynastymasra.math.konversi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.dynastymasra.math.R;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class KonversiHitung extends Activity {

    private TextView judul, input, hasil;
    private EditText editText;
    private Button buttonNext, buttonBack;
    private Spinner spinnerFrom, spinnerTo;
    private Integer number, positionFrom, positinTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.konversi_hitung);

        editText = (EditText) findViewById(R.id.editTextKonversiHitung);
        judul = (TextView) findViewById(R.id.textViewKonversiHitung);
        input = (TextView) findViewById(R.id.textViewKonversiHitung1);
        hasil = (TextView) findViewById(R.id.textViewKonversiHitung2);
        buttonNext = (Button) findViewById(R.id.buttonKonversiHitung1);
        buttonBack = (Button) findViewById(R.id.buttonKonversiHitung);
        spinnerFrom = (Spinner) findViewById(R.id.spinnerKonversiHitung);
        spinnerTo = (Spinner) findViewById(R.id.spinnerKonversiHitung1);

        view();

        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.
                positionFrom = spinnerFrom.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //To change body of implemented methods use File | Settings | File Templates.
            }
        });
        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.
                positinTo = spinnerTo.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //To change body of implemented methods use File | Settings | File Templates.
            }
        });

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
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(KonversiHitung.this, "Masukan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });
    }

    private void view() {
        Intent intent = getIntent();
        String item = intent.getStringExtra("item");

        if (item.equalsIgnoreCase("Konversi Panjang")) {
            String[] panjang = {"KM", "HM", "DAM", "M", "DM", "CM", "MM"};

            judul.setText(item);
            input.setText("Masukan Panjang Awal");

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, panjang);
            spinnerFrom.setAdapter(adapter);
            spinnerTo.setAdapter(adapter);
            number = 1;
        } else if (item.equalsIgnoreCase("Konversi Berat")) {
            String[] berat = {"KG", "HG", "DAG", "G", "DG", "CG", "MG"};

            judul.setText(item);
            input.setText("Masukan Berat");

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, berat);
            spinnerFrom.setAdapter(adapter);
            spinnerTo.setAdapter(adapter);
            number = 1;
        } else if (item.equalsIgnoreCase("Konversi Volume")) {
            String[] volume = {"KL", "HL", "DAL", "L", "DL", "CL", "ML"};

            judul.setText(item);
            input.setText("Masukan Volume");

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, volume);
            spinnerFrom.setAdapter(adapter);
            spinnerTo.setAdapter(adapter);
            number = 1;
        } else if (item.equalsIgnoreCase("Konversi Suhu")) {
            String[] suhu = {"C", "F", "R", "K"};

            judul.setText(item);
            input.setText("Masukan Volume");

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, suhu);
            spinnerFrom.setAdapter(adapter);
            spinnerTo.setAdapter(adapter);
            number = 2;
        }
    }

    private void hitung() {
        if (number == 1) {
            if (positionFrom > positinTo) {
                int kali = positionFrom - positinTo;
                Double hitung = Double.valueOf(editText.getText().toString());
                for (int i = 0; i < kali; i++) {
                    hitung = hitung / 10;
                }
                hasil.setText("" + hitung);
            } else if (positionFrom < positinTo) {
                int kali = positinTo - positionFrom;
                Double hitung = Double.valueOf(editText.getText().toString());
                for (int i = 0; i < kali; i++) {
                    hitung = hitung * 10;
                }
                hasil.setText("" + hitung);
            } else {
                hasil.setText(editText.getText().toString());
            }
        } else if (number == 2) {
            if (positionFrom == 0) {
                if (positinTo == 1) {
                    Double hitung = Double.valueOf(editText.getText().toString()) / 5 * 9 + 32;
                    hasil.setText("" + hitung);
                } else if (positinTo == 2) {
                    Double hitung = Double.valueOf(editText.getText().toString()) / 5 * 4;
                    hasil.setText("" + hitung);
                } else if (positinTo == 3) {
                    Double hitung = Double.valueOf(editText.getText().toString()) + 273.15;
                    hasil.setText("" + hitung);
                } else {
                    hasil.setText(editText.getText().toString());
                }
            } else if (positionFrom == 1) {
                if (positinTo == 0) {
                    Double hitung = (Double.valueOf(editText.getText().toString()) - 32) / 9 * 5;
                    hasil.setText("" + hitung);
                } else if (positinTo == 2) {
                    Double hitung = (Double.valueOf(editText.getText().toString()) - 32) / 9 * 4;
                    hasil.setText("" + hitung);
                } else if (positinTo == 3) {
                    Double hitung = (Double.valueOf(editText.getText().toString()) - 32) / 9 * 5 + 273.15;
                    hasil.setText("" + hitung);
                } else {
                    hasil.setText(editText.getText().toString());
                }
            } else if (positionFrom == 2) {
                if (positinTo == 0) {
                    Double hitung = Double.valueOf(editText.getText().toString()) / 4 * 5;
                    hasil.setText("" + hitung);
                } else if (positinTo == 1) {
                    Double hitung = Double.valueOf(editText.getText().toString()) / 4 * 9 + 32;
                    hasil.setText("" + hitung);
                } else if (positinTo == 3) {
                    Double hitung = Double.valueOf(editText.getText().toString()) / 4 * 5 + 273.15;
                    hasil.setText("" + hitung);
                } else {
                    hasil.setText(editText.getText().toString());
                }
            } else if (positionFrom == 3) {
                if (positinTo == 0) {
                    Double hitung = Double.valueOf(editText.getText().toString()) - 273.15;
                    hasil.setText("" + hitung);
                } else if (positinTo == 1) {
                    Double hitung = (Double.valueOf(editText.getText().toString()) + 273.15) / 5 * 9 + 32;
                    hasil.setText("" + hitung);
                } else if (positinTo == 2) {
                    Double hitung = (Double.valueOf(editText.getText().toString()) - 273.15) / 5 * 4;
                    hasil.setText("" + hitung);
                } else {
                    hasil.setText(editText.getText().toString());
                }
            }
        }
    }
}
