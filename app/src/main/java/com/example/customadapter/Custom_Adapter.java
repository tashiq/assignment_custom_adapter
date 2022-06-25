package com.example.customadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom_Adapter extends BaseAdapter {
    private final Integer[] imgId;
    private final String[] actors;
    private final Activity context;
    private final String[] subtitle;
    public Custom_Adapter(Integer[] imgId, String[] actors, Activity context, String[] subtitle) {
        this.imgId = imgId;
        this.actors = actors;
        this.context = context;
        this.subtitle = subtitle;
    }

    @Override
    public int getCount() {
        return actors.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View row = inflater.inflate(R.layout.custom_adapter, null, true);
        TextView tv = row.findViewById(R.id.text);
        TextView sub = row.findViewById(R.id.sub_title);
        ImageView img = row.findViewById(R.id.image);
        tv.setText(actors[position]);
        img.setImageResource(imgId[position]);
        sub.setText(subtitle[position]);
        return row;
    }
}
