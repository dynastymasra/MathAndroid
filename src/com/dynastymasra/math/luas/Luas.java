package com.dynastymasra.math.luas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.dynastymasra.math.CustomList;
import com.dynastymasra.math.R;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class Luas extends Activity {

    private ListView listView;
    private String[] text = {"Belah Ketupat", "Jajar Genjang", "Lingkaran", "Persegi", "Persegi Panjang", "Segitiga", "Trapesium"};
    private Integer[] image = {R.drawable.belah, R.drawable.jajar, R.drawable.lingkaran, R.drawable.persegi, R.drawable.persegi_panjang, R.drawable.segitiga, R.drawable.trapesium};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.main);

        CustomList customList = new CustomList(Luas.this, text, image);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.
                Toast.makeText(Luas.this, text[i], Toast.LENGTH_SHORT).show();
                selectedItem(text[i]);
            }
        });
    }

    public void selectedItem(String item) {
        Intent intent = new Intent(Luas.this, LuasExample.class);
        intent.putExtra("item", item);
        startActivity(intent);
    }
}
