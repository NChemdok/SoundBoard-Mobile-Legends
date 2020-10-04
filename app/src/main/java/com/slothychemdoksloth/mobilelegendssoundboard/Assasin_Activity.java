package com.slothychemdoksloth.mobilelegendssoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Assasin_Activity extends AppCompatActivity {

    //ListView assassin_view;

    String[] saber_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] haya_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] helcurt_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5","Audio 6", "Audio 7", "Audio 8", "Audio 9"};
    String[] karina_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4"};
    String[] lance_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5","Audio 6", "Audio 7", "Audio 8", "Audio 9"};
    String[] nata_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5","Audio 6"};
    String[] fanny_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] selena_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5","Audio 6", "Audio 7", "Audio 8", "Audio 9", "Audio 10",
            "Audio 11", "Audio 12", "Audio 13", "Audio 14", "Audio 15"};
    String[] gussion_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5","Audio 6", "Audio 7", "Audio 8", "Audio 9", "Audio 10"};
    String[] hanzo_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5","Audio 6", "Audio 7", "Audio 8", "Audio 9", "Audio 10"};

    int saberId[] =  {R.raw.saber, R.raw.saber1, R.raw.saber2, R.raw.saber3, R.raw.saber4};
    int hayaId[] =  {R.raw.haya, R.raw.haya1, R.raw.haya2, R.raw.haya3, R.raw.haya4};
    int helcurtId[] =  {R.raw.hellcurt, R.raw.hellcurt1, R.raw.hellcurt2, R.raw.hellcurt3, R.raw.hellcurt4, R.raw.hellcurt5, R.raw.hellcurt6, R.raw.hellcurt7, R.raw.hellcurt8};
    int karinaId[] =  {R.raw.karina, R.raw.karina1, R.raw.karina2, R.raw.karina3};
    int lanceId[] =  {R.raw.lance, R.raw.lance1, R.raw.lance2, R.raw.lance3, R.raw.lance4, R.raw.lance5, R.raw.lance6, R.raw.lance, R.raw.lance8};
    int nataId[] =  {R.raw.nata, R.raw.nata1, R.raw.nata2, R.raw.nata3, R.raw.nata4, R.raw.nata5};
    int fannyId[] =  {R.raw.fanny, R.raw.fanny1, R.raw.fanny2,  R.raw.fanny3,  R.raw.fanny4};
    int hanzoId[] =  {R.raw.hanzo, R.raw.hanzo1, R.raw.hanzo2, R.raw.hanzo3, R.raw.hanzo4, R.raw.hanzo5, R.raw.hanzo6, R.raw.hanzo7, R.raw.hanzo8,
            R.raw.hanzo9};
    int selenaId[] =  {R.raw.selena, R.raw.selena1, R.raw.selena2, R.raw.selena3, R.raw.selena4, R.raw.selena5, R.raw.selena6, R.raw.selena7, R.raw.selena8,
            R.raw.selena9, R.raw.selena10, R.raw.selena11, R.raw.selena12, R.raw.selena13, R.raw.selena14 };
    int gussionId[] =  {R.raw.gussion, R.raw.gussion1, R.raw.gussion2, R.raw.gussion3, R.raw.gussion4, R.raw.gussion5, R.raw.gussion6, R.raw.gussion7, R.raw.gussion8, R.raw.gussion9};

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assasin_);

        MobileAds.initialize(this,"ca-app-pub-7717760204588800~8036911192");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        ImageButton btn_view_1, btn_view_2, btn_view_3, btn_view_4, btn_view_5, btn_view_6, btn_view_7, btn_view_8, btn_view_9, btn_view_10;

        btn_view_1 = findViewById(R.id.btn1);
        btn_view_2 = findViewById(R.id.btn2);
        btn_view_3 = findViewById(R.id.btn3);
        btn_view_4 = findViewById(R.id.btn4);
        btn_view_5 = findViewById(R.id.btn5);
        btn_view_6 = findViewById(R.id.btn6);
        btn_view_7 = findViewById(R.id.btn7);
        btn_view_8 = findViewById(R.id.btn8);
        btn_view_9 = findViewById(R.id.btn9);
        btn_view_10 = findViewById(R.id.btn10);

        btn_view_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", fanny_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", fannyId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", gussion_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", gussionId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", haya_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", hayaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", helcurt_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", helcurtId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", karina_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", karinaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", lance_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", lanceId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", nata_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", nataId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", saber_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", saberId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", selena_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", selenaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assasin_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", hanzo_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", hanzoId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

    }
}
