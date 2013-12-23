package com.dynastymasra.math;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.dynastymasra.math.exercise.Exercise;
import com.dynastymasra.math.keliling.Keliling;
import com.dynastymasra.math.konversi.Konversi;
import com.dynastymasra.math.luas.Luas;
import com.dynastymasra.math.volume.Volume;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class MyActivity extends Activity {

    private ListView listView;
    private String[] text = {"Menghitung Luas", "Menghitung Keliling", "Menghitung Volume", "Konversi Panjang", "Konversi Berat", "Konversi Volume", "Konversi Suhu", "Latihan", "About"};
    private Integer[] image = {R.drawable.luas, R.drawable.keliling, R.drawable.volume, R.drawable.panjang, R.drawable.berat, R.drawable.volum, R.drawable.suhu, R.drawable.exe, R.drawable.about};

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        CustomList customList = new CustomList(MyActivity.this, text, image);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.
                Toast.makeText(MyActivity.this, text[i], Toast.LENGTH_SHORT).show();
                selectedItem(text[i]);
            }
        });
    }

    public void selectedItem(String item) {
        if (item.equalsIgnoreCase("Menghitung Luas")) {
            Intent intent = new Intent(MyActivity.this, Luas.class);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Menghitung Keliling")) {
            Intent intent = new Intent(MyActivity.this, Keliling.class);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Menghitung Volume")) {
            Intent intent = new Intent(MyActivity.this, Volume.class);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Konversi Panjang")) {
            Intent intent = new Intent(MyActivity.this, Konversi.class);
            intent.putExtra("item", item);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Konversi Berat")) {
            Intent intent = new Intent(MyActivity.this, Konversi.class);
            intent.putExtra("item", item);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Konversi Volume")) {
            Intent intent = new Intent(MyActivity.this, Konversi.class);
            intent.putExtra("item", item);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Konversi Suhu")) {
            Intent intent = new Intent(MyActivity.this, Konversi.class);
            intent.putExtra("item", item);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Latihan")) {
            Intent intent = new Intent(MyActivity.this, Exercise.class);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("About")) {
            Intent intent = new Intent(MyActivity.this, AboutUs.class);
            startActivity(intent);
        }
    }
}
