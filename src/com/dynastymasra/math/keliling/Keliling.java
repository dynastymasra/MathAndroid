package com.dynastymasra.math.keliling;

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

public class Keliling extends Activity {

    private ListView listView;
    private String[] text = {"Jajar Genjang", "Layang-layang", "Lingkaran", "Persegi Panjang", "Persegi", "Segitiga", "Trapesium"};
    private Integer[] image = {R.drawable.jajar, R.drawable.layang_layang, R.drawable.lingkaran, R.drawable.persegi_panjang, R.drawable.persegi, R.drawable.segitiga, R.drawable.trapesium};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.main);

        CustomList customList = new CustomList(Keliling.this, text, image);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(customList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.
                Toast.makeText(Keliling.this, text[i], Toast.LENGTH_SHORT).show();
                selectedItem(text[i]);
            }
        });
    }

    public void selectedItem(String item) {
        Intent intent = new Intent(Keliling.this, KelilingExample.class);
        intent.putExtra("item", item);
        startActivity(intent);
    }
}
