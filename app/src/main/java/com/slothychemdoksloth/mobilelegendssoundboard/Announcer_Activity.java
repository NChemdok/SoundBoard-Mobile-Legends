package com.slothychemdoksloth.mobilelegendssoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Announcer_Activity extends AppCompatActivity {

    String[] oldbluean_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] oldredan_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] bluean_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6",
            "Audio 7", "Audio 8", "Audio 9", "Audio 10", "Audio 11", "Audio 12",
            "Audio 13", "Audio 14", "Audio 15", "Audio 16", "Audio 17", "Audio 18"};
    String[] redan_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6",
            "Audio 7", "Audio 8", "Audio 9", "Audio 10", "Audio 11", "Audio 12",
            "Audio 13", "Audio 14"};

    int oldblueanId[] =  {R.raw.anblue4, R.raw.anblue5, R.raw.anblue6, R.raw.oldbluean, R.raw.oldbluean1, R.raw.anace};
    int oldredanId[] =  {R.raw.anred1, R.raw.anred2, R.raw.anred3, R.raw.oldredan, R.raw.oldredan1, R.raw.anace};

    int blueanId[] =  {R.raw.announcer_1, R.raw.announcer_2, R.raw.announcer_3, R.raw.announcer_4, R.raw.announcer_5, R.raw.announcer_6,
            R.raw.announcer_7, R.raw.announcer_8, R.raw.announcer_9, R.raw.announcer_10, R.raw.announcer_11, R.raw.announcer_12,
            R.raw.announcer_13, R.raw.announcer_14, R.raw.announcer_15, R.raw.announcer_16, R.raw.announcer_17, R.raw.announcer_18};
    int redanId[] =  {R.raw.announcer_19, R.raw.announcer_20, R.raw.announcer_21, R.raw.announcer_22, R.raw.announcer_23, R.raw.announcer_24,
            R.raw.announcer_25, R.raw.announcer_26, R.raw.announcer_27, R.raw.announcer_28, R.raw.announcer_29, R.raw.announcer_30,
            R.raw.announcer_31, R.raw.announcer_32};

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcer_);

        MobileAds.initialize(this,"ca-app-pub-7717760204588800~8036911192");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        ImageButton btn_view_1, btn_view_2, btn_view_3, btn_view_4;

        btn_view_1 = findViewById(R.id.btn1);
        btn_view_2 = findViewById(R.id.btn2);
        btn_view_3 = findViewById(R.id.btn3);
        btn_view_4 = findViewById(R.id.btn4);


        btn_view_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Announcer_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", bluean_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", blueanId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Announcer_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", redan_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", redanId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });



        btn_view_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Announcer_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", oldbluean_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", oldblueanId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Announcer_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", oldredan_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", oldredanId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });
    }
}
