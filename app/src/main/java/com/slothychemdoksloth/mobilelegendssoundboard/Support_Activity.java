package com.slothychemdoksloth.mobilelegendssoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Support_Activity extends AppCompatActivity {

    String[] angela_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9",
    "Audio 10", "Audio 11", "Audio 12", "Audio 13"};

    String[] diggie_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9", "Audio 10"};
    String[] estes_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] rafaela_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4"};

    int angelaId[] =  {R.raw.angela, R.raw.angela1, R.raw.angela2, R.raw.angela3, R.raw.angela4, R.raw.angela5,R.raw.angela6,
            R.raw.angela7, R.raw.angela8, R.raw.angela9, R.raw.angela10, R.raw.angela11, R.raw.angela12 };

    int diggieId[] =  {R.raw.diggie, R.raw.diggie1, R.raw.diggie2, R.raw.diggie3, R.raw.diggie4, R.raw.diggie5,R.raw.diggie6,
            R.raw.diggie7, R.raw.diggie8, R.raw.diggie9};

    int estesId[] =  {R.raw.estes, R.raw.estes1, R.raw.estes2, R.raw.estes3, R.raw.estes4};
    int rafaelaId[] =  {R.raw.rafaela, R.raw.rafaela1, R.raw.rafaela2, R.raw.rafaela3};
    ImageButton btn_view_1, btn_view_2, btn_view_3, btn_view_4 ;

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support_);

        MobileAds.initialize(this,"ca-app-pub-7717760204588800~8036911192");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        btn_view_1 = findViewById(R.id.btn1);
        btn_view_2 = findViewById(R.id.btn2);
        btn_view_3 = findViewById(R.id.btn3);
        btn_view_4 = findViewById(R.id.btn4);

        btn_view_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Support_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", angela_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", angelaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Support_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", diggie_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", diggieId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Support_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", estes_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", estesId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Support_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", rafaela_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", rafaelaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

    }
}
