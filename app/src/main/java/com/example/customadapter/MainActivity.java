package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] items ={"Movies", "Politics", "Sports", "Economics", "Study"};
    Integer[] images = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five
    };
    String[] subtitle ={
            "Thor:Love and Thunder is at the theater now.",
            "Every Politician is not honest",
            "Sakib Al Hasan is the next test captain.",
            "Share Market getting worse.",
            "Poralekha 🤣🤣"
    };
    ListView lv;
    Intent ii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Custom_Adapter custom_adapter = new Custom_Adapter(images, items, MainActivity.this, subtitle);
        lv = findViewById(R.id.listview);
        lv.setAdapter(custom_adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Clicked Item",items[position]+" "+subtitle[position]);
                ii = new Intent(getApplicationContext(), NewsPage.class);
                ii.putExtra("title", items[position]);
                ii.putExtra("subtitle", subtitle[position]);
                ii.putExtra("image", images[position]);
                startActivity(ii);
            }
        });
    }
}