package com.slothychemdoksloth.mobilelegendssoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Tank_Activity extends AppCompatActivity {

    String[] franco_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4"};
    String[] gatot_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};
    String[] grock_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};
    String[] hylos_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] johnson_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};
    String[] mino_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] lolita_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] tigreal_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] kaja_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};
    String[] uranus_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};
    String[] akai_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};

    int kajaId[] =  {R.raw.kaja, R.raw.kaja1, R.raw.kaja2, R.raw.kaja3, R.raw.kaja4, R.raw.kaja5,R.raw.kaja6,R.raw.kaja7};
    int uranusId[] =  {R.raw.uranus0, R.raw.uranus, R.raw.uranus1, R.raw.uranus2, R.raw.uranus3, R.raw.uranus4,R.raw.uranus5,R.raw.uranus6};
    int akaiId[] =  {R.raw.akai, R.raw.akai1, R.raw.akai2, R.raw.akai3, R.raw.akai4, R.raw.akai5,R.raw.akai6};
    int francoId[] =  {R.raw.franco, R.raw.franco1, R.raw.franco2, R.raw.franco3};
    int gatotId[] =  {R.raw.gatot, R.raw.gatot1, R.raw.gatot2, R.raw.gatot3, R.raw.gatot4, R.raw.gatot5,R.raw.gatot6};
    int grockId[] =  {R.raw.grock, R.raw.grock1, R.raw.grock2, R.raw.grock3, R.raw.grock4, R.raw.grock5,R.raw.grock6};
    int hylosId[] =  {R.raw.hylos, R.raw.hylos1, R.raw.hylos2, R.raw.hylos3, R.raw.hylos4, R.raw.hylos5};
    int johnsonId[] =  {R.raw.johnson, R.raw.johnson1, R.raw.johnson2, R.raw.johnson3, R.raw.johnson4, R.raw.johnson5,R.raw.johnson6,R.raw.johnson7};
    int minoId[] =  {R.raw.mino, R.raw.mino1, R.raw.mino2, R.raw.mino3, R.raw.mino4};
    int lolitaId[] =  {R.raw.lolita, R.raw.lolita1, R.raw.lolita2, R.raw.lolita3, R.raw.lolita4, R.raw.lolita5};
    int tigrealId[] =  {R.raw.tigreal, R.raw.tigreal1, R.raw.tigreal2, R.raw.tigreal3, R.raw.tigreal4};

    ImageButton btn_view_1, btn_view_2, btn_view_3, btn_view_4, btn_view_5, btn_view_6, btn_view_7, btn_view_8,  btn_view_9,
            btn_view_10, btn_view_11, btn_view_12;

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tank_);

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
        btn_view_8 = findViewById(R.id.btn8);
        btn_view_9 = findViewById(R.id.btn9);
        btn_view_10 = findViewById(R.id.btn10);
        btn_view_11 = findViewById(R.id.btn11);
        btn_view_12 = findViewById(R.id.btn12);

        btn_view_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", akai_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", akaiId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", franco_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", francoId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", gatot_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", gatotId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", grock_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", grockId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", hylos_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", hylosId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", tigreal_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", tigrealId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", johnson_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", johnsonId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", kaja_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", kajaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", lolita_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", lolitaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", mino_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", minoId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tank_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", uranus_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", uranusId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

    }
}