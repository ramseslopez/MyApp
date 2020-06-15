package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
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

        String[] links = {"https://www.youtube.com/watch?v=fCn8zs912OE", "https://www.youtube.com/watch?v=buVUvnM_AzU",
                          "https://www.youtube.com/watch?v=BIePWBgKaXw", "https://www.youtube.com/watch?v=tpIctyqH29Q&list=PL8dPuuaLjXtNlUrzyH5r6jN9ulIgZBpdo",
                          "https://www.youtube.com/watch?v=YMPzDiraNnA", "https://www.youtube.com/watch?v=7DZLlwm8-ow",
                          "google.streetview:cbll=46.414382,10.013988", "geo:37.7749,-122.4194", "geo:0,0?q=restaurants",
                          "https://www.android.com/", "google.navigation:q=Universidad+Nacional+Autonoma+de+Mexico,+Mexico"};

        arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list, R.id.textView, links);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)listView.getItemAtPosition(position);
                Toast.makeText(Welcome.this, item, Toast.LENGTH_SHORT).show();
                if (item.equals("https://www.youtube.com/watch?v=fCn8zs912OE")){
                    Uri video = Uri.parse("https://www.youtube.com/watch?v=fCn8zs912OE");
                    Intent videoIntent = new Intent(Intent.ACTION_VIEW,video);
                    startActivity(videoIntent);
                } else if (item.equals("https://www.youtube.com/watch?v=buVUvnM_AzU")) {
                    Uri video = Uri.parse("https://www.youtube.com/watch?v=buVUvnM_AzU");
                    Intent videoIntent = new Intent(Intent.ACTION_VIEW, video);
                    startActivity(videoIntent);
                } else if (item.equals("https://www.youtube.com/watch?v=BIePWBgKaXw")) {
                    Uri video = Uri.parse("https://www.youtube.com/watch?v=BIePWBgKaXw");
                    Intent videoIntent = new Intent(Intent.ACTION_VIEW, video);
                    startActivity(videoIntent);
                } else if (item.equals("https://www.youtube.com/watch?v=tpIctyqH29Q&list=PL8dPuuaLjXtNlUrzyH5r6jN9ulIgZBpdo")) {
                    Uri video = Uri.parse("https://www.youtube.com/watch?v=tpIctyqH29Q&list=PL8dPuuaLjXtNlUrzyH5r6jN9ulIgZBpdo");
                    Intent videoIntent = new Intent(Intent.ACTION_VIEW, video);
                    startActivity(videoIntent);
                } else if (item.equals("https://www.youtube.com/watch?v=YMPzDiraNnA")) {
                    Uri video = Uri.parse("https://www.youtube.com/watch?v=YMPzDiraNnA");
                    Intent videoIntent = new Intent(Intent.ACTION_VIEW, video);
                    startActivity(videoIntent);
                } else if (item.equals("https://www.youtube.com/watch?v=7DZLlwm8-ow")) {
                    Uri video = Uri.parse("https://www.youtube.com/watch?v=7DZLlwm8-ow");
                    Intent videoIntent = new Intent(Intent.ACTION_VIEW, video);
                    startActivity(videoIntent);
                } else if (item.equals("https://www.android.com/")) {
                    Uri page = Uri.parse("https://www.android.com/");
                    Intent pageIntent = new Intent(Intent.ACTION_VIEW, page);
                    startActivity(pageIntent);
                } else if (item.equals("geo:37.7749,-122.4194")) {
                    Uri map = Uri.parse("geo:37.7749,-122.4194");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, map);
                    startActivity(mapIntent);
                } else if (item.equals("geo:0,0?q=restaurants")) {
                    Uri map = Uri.parse("geo:0,0?q=restaurants");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, map);
                    startActivity(mapIntent);
                } else if (item.equals("google.streetview:cbll=46.414382,10.013988")) {
                    Uri map = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, map);
                    startActivity(mapIntent);
                } else if (item.equals("google.navigation:q=Universidad+Nacional+Autonoma+de+Mexico,+Mexico")) {
                    Uri map = Uri.parse("google.navigation:q=Universidad+Nacional+Autonoma+de+Mexico,+Mexico");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, map);
                    startActivity(mapIntent);
                }
            }
        });
    }
}
