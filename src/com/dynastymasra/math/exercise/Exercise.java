package com.dynastymasra.math.exercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.dynastymasra.math.AboutUs;
import com.dynastymasra.math.CustomList;
import com.dynastymasra.math.R;
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

public class Exercise extends Activity {

    private ListView listView;
    private String[] text = {"Beginner", "Intermediate", "Advanced"};
    private Integer[] image = {R.drawable.exe, R.drawable.exe, R.drawable.exe};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.main);

        CustomList customList = new CustomList(Exercise.this, text, image);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.
                Toast.makeText(Exercise.this, text[i], Toast.LENGTH_SHORT).show();
                selectedItem(text[i]);
            }
        });
    }

    public void selectedItem(String item) {
        if (item.equalsIgnoreCase("Beginner")) {
            Intent intent = new Intent(Exercise.this, ExerciseBeginner.class);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Intermediate")) {
            Intent intent = new Intent(Exercise.this, ExerciseIntermediate.class);
            startActivity(intent);
        } else if (item.equalsIgnoreCase("Advanced")) {
            Intent intent = new Intent(Exercise.this, ExerciseAdvanced.class);
            startActivity(intent);
        }
    }
}
