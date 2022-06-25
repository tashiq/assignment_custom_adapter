package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsPage extends AppCompatActivity {
    String title;
    String subtitle;
    Integer imgid;
    TextView tv1;
    TextView tv2;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_page);
        title = getIntent().getExtras().getString("title");
        subtitle = getIntent().getExtras().getString("subtitle");
        imgid = getIntent().getExtras().getInt("image");
        /*Log.i("Title", title);
        Log.i("Sub Title", subtitle);
        Log.i("Image", Integer.toString(imgid));*/
        tv1 = findViewById(R.id.title_show);
        tv1.setText(title);
        tv2 = findViewById(R.id.subtitle_show);
        tv2.setText(subtitle);
        iv = findViewById(R.id.image_show);
        iv.setImageResource(imgid);
    }
}