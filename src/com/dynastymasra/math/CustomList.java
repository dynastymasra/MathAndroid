package com.dynastymasra.math;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.dynastymasra.math.R;

/**
* Author   : Dynastymasra
* Name     : Dimas Ragil T
* Email    : dynastymasra@gmail.com
* LinkedIn : http://www.linkedin.com/in/dynastymasra
* Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
*/

public class CustomList extends ArrayAdapter<String> {

    private final Activity activity;
    private final String[] text;
    private final Integer[] image;

    public CustomList(Activity activity, String[] text, Integer[] image) {
        super(activity, R.layout.list_content, text);
        this.activity = activity;
        this.text = text;
        this.image = image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.list_content, null, true);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        textView.setText(text[position]);
        imageView.setImageResource(image[position]);

        return view;    //To change body of overridden methods use File | Settings | File Templates.
    }
}
