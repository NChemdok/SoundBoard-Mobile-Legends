package com.slothychemdoksloth.mobilelegendssoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Fighter_Activity extends AppCompatActivity {

    String[] alpha_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};
    String[] aldous_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};
    String[] leomord_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};
    String[] thamuz_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};
    String[] martis_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};

    String[] alucard_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] balmond_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] argus_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};
    String[] bane_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] chou_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] freya_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] hilda_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] jawhead_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};
    String[] lapu_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};
    String[] sun_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] zilong_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] roger_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};

    String[] ruby_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9", "Audio 10"};

    int aldousId[] =  {R.raw.aldous0, R.raw.aldous, R.raw.aldous1, R.raw.aldous2, R.raw.aldous3, R.raw.aldous4,R.raw.aldous5, R.raw.aldous6};
    int leomordId[] =  {R.raw.leomord, R.raw.leomord1, R.raw.leomord2, R.raw.leomord3, R.raw.leomord4, R.raw.leomord5,R.raw.leomord6, R.raw.leomord7,
            R.raw.leomord8};
    int thamuzId[] =  {R.raw.thamuz, R.raw.thamuz1, R.raw.thamuz2, R.raw.thamuz3, R.raw.thamuz4, R.raw.thamuz5,R.raw.thamuz6, R.raw.thamuz7,
            R.raw.thamuz8};
    int alucardId[] =  {R.raw.alucard, R.raw.alucard1, R.raw.alucard2, R.raw.alucard3, R.raw.alucard4, R.raw.alucard5};
    int balmondId[] =  {R.raw. balmond0, R.raw. balmond, R.raw.balmond1, R.raw.balmond2, R.raw.balmond3};
    int argusId[] =  {R.raw.argus, R.raw.argus1, R.raw.argus2, R.raw.argus3, R.raw.argus4, R.raw.argus5,R.raw.argus6, R.raw.argus7};
    int baneId[] =  {R.raw.bane, R.raw.bane1, R.raw.bane2, R.raw.bane3, R.raw.bane4};
    int chouId[] =  {R.raw.chou, R.raw.chou1, R.raw.chou2, R.raw.chou3, R.raw.chou4, R.raw.chou5};
    int freyaId[] =  {R.raw.freya, R.raw.freya1, R.raw.freya2, R.raw.freya3, R.raw.freya4};
    int hildaId[] =  {R.raw.hilda, R.raw.hilda1, R.raw.hilda2, R.raw.hilda3, R.raw.hilda4, R.raw.hilda5};
    int martisId[] =  {R.raw.martis, R.raw.martis1, R.raw.martis2, R.raw.martis3, R.raw.martis4, R.raw.martis5, R.raw.martis6};
    int jawheadId[] =  {R.raw.jawhead, R.raw.jawhead1, R.raw.jawhead2, R.raw.jawhead3, R.raw.jawhead4, R.raw.jawhead5,R.raw.jawhead6, R.raw.jawhead7};
    int lapuId[] =  {R.raw.lapu, R.raw.lapu1, R.raw.lapu2, R.raw.lapu3, R.raw.lapu4, R.raw.lapu5,R.raw.lapu6, R.raw.lapu7};
    int sunId[] =  {R.raw.sun, R.raw.sun1, R.raw.sun2, R.raw.sun3, R.raw.sun4};
    int zilongId[] =  {R.raw.zilong, R.raw.zilong1, R.raw.zilong2, R.raw.zilong3, R.raw.zilong4, R.raw.zilong5};
    int alphaId[] =  {R.raw.alpha, R.raw.alpha1, R.raw.alpha2, R.raw.alpha3, R.raw.alpha4, R.raw.alpha5,R.raw.alpha6, R.raw.alpha7, R.raw.alpha8 };

    int rogerId[] =  {R.raw.roger, R.raw.roger1, R.raw.roger2, R.raw.roger3, R.raw.roger4, R.raw.roger5, R.raw.roger6, R.raw.roger7, R.raw.roger8 };

    int rubyId[] =  {R.raw.ruby, R.raw.ruby1, R.raw.ruby2, R.raw.ruby3, R.raw.ruby4, R.raw.ruby5, R.raw.ruby6, R.raw.ruby7, R.raw.ruby8, R.raw.ruby9 };

    ImageButton btn_view_1, btn_view_2, btn_view_3, btn_view_4, btn_view_5, btn_view_6, btn_view_7, btn_view_8,  btn_view_9,
            btn_view_10, btn_view_11, btn_view_12, btn_view_13, btn_view_14, btn_view_15, btn_view_16, btn_view_17, btn_view_18;

//
    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fighter_);

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
        btn_view_13 = findViewById(R.id.btn13);
        btn_view_14 = findViewById(R.id.btn14);
        btn_view_15 = findViewById(R.id.btn15);
        btn_view_16 = findViewById(R.id.btn16);
        btn_view_17 = findViewById(R.id.btn17);
        btn_view_18 = findViewById(R.id.btn18);

        btn_view_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", aldous_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", aldousId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", alpha_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", alphaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", alucard_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", alucardId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", argus_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", argusId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", balmond_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", balmondId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", bane_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", baneId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", chou_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", chouId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", freya_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", freyaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", hilda_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", hildaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", jawhead_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", jawheadId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", lapu_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", lapuId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", leomord_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", leomordId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", martis_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", martisId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", roger_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", rogerId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", ruby_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", rubyId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", sun_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", sunId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", thamuz_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", thamuzId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });

        btn_view_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fighter_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", zilong_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", zilongId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);
            }
        });
    }
}
