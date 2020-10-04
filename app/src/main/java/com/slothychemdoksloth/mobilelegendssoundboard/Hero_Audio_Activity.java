package com.slothychemdoksloth.mobilelegendssoundboard;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Hero_Audio_Activity extends AppCompatActivity {

    ListView voice_view;

    MediaPlayer mp;

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero__audio_);

        Bundle hero_bundle = getIntent().getExtras();
        final String[] hero_audio_list = hero_bundle.getStringArray("audio");
        Bundle files_bundle = getIntent().getExtras();
        final int[] hero_files_list = files_bundle.getIntArray("files");


        MobileAds.initialize(this,"ca-app-pub-7717760204588800~8036911192");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        voice_view = findViewById(R.id.list_voice_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Hero_Audio_Activity.this, android.R.layout.simple_list_item_1, hero_audio_list)
        {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View view = super.getView(position, convertView, parent);

                TextView ListItemShow = (TextView) view.findViewById(android.R.id.text1);

                ListItemShow.setBackgroundResource(R.drawable.border);

                ListItemShow.setTextColor(Color.parseColor("#00FF0C"));

                return view;
            }
        };
        voice_view.setAdapter(adapter);
        voice_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                stopPlaying();
            mp = MediaPlayer.create(Hero_Audio_Activity.this, hero_files_list[position]);
                mp.start();
            }

    });

}

    protected void stopPlaying()
    {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
