package com.slothychemdoksloth.mobilelegendssoundboard;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {

    ImageButton btn_view_1, btn_view_2, btn_view_3, btn_view_4, btn_view_5, btn_view_6, btn_view_7;

    ImageView img_logo,img_head, img_help;

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-7717760204588800~8036911192");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        btn_view_1 = findViewById(R.id.btn1);
        btn_view_2 = findViewById(R.id.btn2);
        btn_view_3 = findViewById(R.id.btn3);
        btn_view_4 = findViewById(R.id.btn4);
        btn_view_5 = findViewById(R.id.btn5);
        btn_view_6 = findViewById(R.id.btn6);
        btn_view_7 = findViewById(R.id.btn7);

        img_logo = findViewById(R.id.mlbbimage);
        img_head = findViewById(R.id.mlbbimage2);
        img_help = findViewById(R.id.options);

       // mAdview = (AdView) findViewById(R.id.adView);
       // AdRequest adRequest = new AdRequest.Builder().build();
        //mAdview.loadAd(adRequest);

        img_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Help_Activity.class);
                //intent.putExtra("hero", list_assassin);
                startActivity(intent);
            }
        });

        btn_view_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Assasin_Activity.class);
                //intent.putExtra("hero", list_assassin);
                startActivity(intent);

            }
        });
        btn_view_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mage_Activity.class);
               // intent.putExtra("hero", list_mage);
                startActivity(intent);

            }
        });
        btn_view_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fighter_Activity.class);
                //intent.putExtra("hero", list_marksman);
                startActivity(intent);

            }
        });

        btn_view_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tank_Activity.class);
                //intent.putExtra("hero", list_marksman);
                startActivity(intent);

            }
        });

        btn_view_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Support_Activity.class);
                //intent.putExtra("hero", list_marksman);
                startActivity(intent);

            }
        });

        btn_view_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Marksman_Activity.class);
                //intent.putExtra("hero", list_marksman);
                startActivity(intent);

            }
        });

        btn_view_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Announcer_Activity.class);
                //intent.putExtra("hero", list_marksman);
                startActivity(intent);

            }
        });
    }

}