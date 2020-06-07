package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.toolbox.StringRequest;

public class Welcome extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        listView = (ListView)findViewById(R.id.simpleListView);

        String[] links = {"https://www.youtube.com/watch?v=fCn8zs912OE", "https://www.youtube.com/watch?v=buVUvnM_AzU", "https://www.youtube.com/watch?v=BIePWBgKaXw",
                "https://www.youtube.com/watch?v=tpIctyqH29Q&list=PL8dPuuaLjXtNlUrzyH5r6jN9ulIgZBpdo", "https://www.youtube.com/watch?v=YMPzDiraNnA",
                "https://www.youtube.com/watch?v=7DZLlwm8-ow", "google.streetview:cbll=46.414382,10.013988", "geo:37.7749,-122.4194", "geo:0,0?q=restaurants",
                "https://www.android.com/", "google.navigation:q=Universidad+Nacional+Autonoma+de+Mexico,+Mexico"};

        arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list, R.id.textView, links);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)listView.getItemAtPosition(position);
                Toast.makeText(Welcome.this, item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
