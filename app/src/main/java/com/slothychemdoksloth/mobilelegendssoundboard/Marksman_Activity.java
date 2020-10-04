package com.slothychemdoksloth.mobilelegendssoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Marksman_Activity extends AppCompatActivity {

    String[] bruno_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] clint_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] irithel_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] karrie_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] layla_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] moskov_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] yss_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] claude_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};
    String[] kimmy_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};

    String[] hanabi_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9", "Audio 10" };

    String[] lesley_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9" };

    String[] miya_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9", "Audio 10", "Audio 11", "Audio 12" };

    int claudeId[] =  {R.raw.claude, R.raw.claude1, R.raw.claude2, R.raw.claude3, R.raw.claude4, R.raw.claude5,R.raw.claude6};
    int kimmyId[] =  {R.raw.kimmy, R.raw.kimmy1, R.raw.kimmy2, R.raw.kimmy3, R.raw.kimmy4, R.raw.kimmy5,R.raw.kimmy6, R.raw.kimmy7};
    int brunoId[] =  {R.raw.bruno, R.raw.bruno1, R.raw.bruno2, R.raw.bruno3, R.raw.bruno4, R.raw.bruno5};
    int clintId[] =  {R.raw.clint, R.raw.clint1, R.raw.clint2, R.raw.clint3, R.raw.clint4};
    int irithelId[] =  {R.raw.irithel, R.raw.irithel1, R.raw.irithel2, R.raw.irithel3, R.raw.irithel4, R.raw.irithel5};
    int karrieId[] =  {R.raw.karrie, R.raw.karrie1, R.raw.karrie2, R.raw.karrie3, R.raw.karrie4};
    int laylaId[] =  {R.raw.layla, R.raw.layla1, R.raw.layla2, R.raw.layla3, R.raw.layla4};
    int moskovId[] =  {R.raw.moskov, R.raw.moskov1, R.raw.moskov2, R.raw.moskov3, R.raw.moskov4};
    int yssId[] =  {R.raw.yss, R.raw.yss1, R.raw.yss2, R.raw.yss3, R.raw.yss4, R.raw.yss5};
    int hanabiId[] =  {R.raw.hanabi, R.raw.hanabi1, R.raw.hanabi2, R.raw.hanabi3, R.raw.hanabi4, R.raw.hanabi5,R.raw.hanabi6, R.raw.hanabi7, R.raw.hanabi8, R.raw.hanabi9 };

    int miyaId[] =  {R.raw.miya, R.raw.miya1, R.raw.miya2, R.raw.miya3, R.raw.miya4, R.raw.miya5,R.raw.miya6, R.raw.miya7, R.raw.miya8, R.raw.miya9,  R.raw.miya10,  R.raw.miya11 };

    int lesleyId[] =  {R.raw.lesley, R.raw.lesley1, R.raw.lesley2, R.raw.lesley3, R.raw.lesley4, R.raw.lesley5,R.raw.lesley6, R.raw.lesley7, R.raw.lesley8 };

    ImageButton btn_view_1, btn_view_2, btn_view_3, btn_view_4, btn_view_5, btn_view_6, btn_view_7, btn_view_8,  btn_view_9,
            btn_view_10, btn_view_11, btn_view_12 ;

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marksman_);

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
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", bruno_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", brunoId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", claude_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", claudeId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", clint_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", clintId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", hanabi_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", hanabiId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", irithel_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", irithelId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", karrie_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", karrieId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", layla_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", laylaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", lesley_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", lesleyId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", miya_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", miyaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", moskov_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", moskovId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", yss_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", yssId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marksman_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", kimmy_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", kimmyId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

    }
}
