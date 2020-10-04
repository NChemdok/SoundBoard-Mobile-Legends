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


public class Mage_Activity extends AppCompatActivity {

    ListView mage_view;

    String[] alice_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4"};
    String[] aurora_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] vexana_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] nana_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5"};
    String[] gord_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};
    String[] zhask_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};
    String[] eudora_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4"};
    String[] harley_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};
    String[] kagura_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};

    String[] pharsa_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};

    String[] cyclops_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};

    String[] odette_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};
    String[] change_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};
    String[] harith_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8", "Audio 9"};
    String[] kadita_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};
    String[] lunox_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7"};
    String[] vale_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6"};
    String[] valir_audio = {"Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5", "Audio 6", "Audio 7", "Audio 8"};

    int changeId[] =  {R.raw.change, R.raw.change1, R.raw.change2, R.raw.change3, R.raw.change4, R.raw.change5,R.raw.change6 };
    int harithId[] =  {R.raw.harith, R.raw.harith1, R.raw.harith2, R.raw.harith3, R.raw.harith4, R.raw.harith5,R.raw.harith6, R.raw.harith7, R.raw.harith8 };
    int kaditaId[] =  {R.raw.kadita, R.raw.kadita1, R.raw.kadita2, R.raw.kadita3, R.raw.kadita4, R.raw.kadita5,R.raw.kadita6 };
    int lunoxId[] =  {R.raw.lunox, R.raw.lunox1, R.raw.lunox2, R.raw.lunox3, R.raw.lunox4, R.raw.lunox5,R.raw.lunox6};
    int valeId[] =  {R.raw.vale, R.raw.vale1, R.raw.vale2, R.raw.vale3, R.raw.vale4, R.raw.vale5};
    int valirId[] =  {R.raw.valir, R.raw.valir1, R.raw.valir2, R.raw.valir3, R.raw.valir4, R.raw.valir5,R.raw.valir6, R.raw.valir7};
    int kaguraId[] =  {R.raw.kagura, R.raw.kagura1, R.raw.kagura2, R.raw.kagura3, R.raw.kagura4, R.raw.kagura5,R.raw.kagura6, R.raw.kagura7, R.raw.kagura8 };

    int pharsaId[] =  {R.raw.pharsa, R.raw.pharsa1, R.raw.pharsa2, R.raw.pharsa3, R.raw.pharsa4, R.raw.pharsa5, R.raw.pharsa6, R.raw.pharsa7, R.raw.pharsa8 };

    int cyclopsId[] =  {R.raw.cyclops, R.raw.cyclops1, R.raw.cyclops2, R.raw.cyclops3, R.raw.cyclops4, R.raw.cyclops5,R.raw.cyclops6, R.raw.cyclops7, R.raw.cyclops8,
            R.raw.cyclops9 };
    int aliceId[] =  {R.raw.alice, R.raw.alice1, R.raw.alice2, R.raw.alice3};
    int eudoraId[] =  {R.raw.eudora, R.raw.eudora1, R.raw.eudora2, R.raw.eudora3};
    int nanaId[] =  {R.raw.nana, R.raw.nana1, R.raw.nana2, R.raw.nana3, R.raw.nana4};
    int auroraId[] =  {R.raw.aurora, R.raw.aurora1, R.raw.aurora2, R.raw.aurora3, R.raw.aurora4};
    int vexanaId[] =  {R.raw.vexana, R.raw.vexana1, R.raw.vexana2, R.raw.vexana3, R.raw.vexana4, R.raw.vexana5};
    int gordId[] =  {R.raw.gord, R.raw.gord1, R.raw.gord2, R.raw.gord3, R.raw.gord4, R.raw.gord5, R.raw.gord6};
    int zhaskId[] =  {R.raw.zhask, R.raw.zhask1, R.raw.zhask2, R.raw.zhask3, R.raw.zhask4, R.raw.zhask5, R.raw.zhask6};
    int harleyId[] =  {R.raw.harley, R.raw.harley1, R.raw.harley2, R.raw.harley3, R.raw.harley4, R.raw.harley5, R.raw.harley6, R.raw.harley7 };
    int odetteId[] =  {R.raw.odette, R.raw.odette1, R.raw.odette2, R.raw.odette3, R.raw.odette4, R.raw.odette5, R.raw.odette6, R.raw.odette7, R.raw.odette8 };

    ImageButton btn_view_1, btn_view_2, btn_view_3, btn_view_4, btn_view_5, btn_view_6, btn_view_7, btn_view_8,  btn_view_9,
            btn_view_10, btn_view_11, btn_view_12, btn_view_13, btn_view_14, btn_view_15, btn_view_16, btn_view_17, btn_view_18;

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mage_);

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
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", alice_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", aliceId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", aurora_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", auroraId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", change_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", changeId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", cyclops_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", cyclopsId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", eudora_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", eudoraId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", gord_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", gordId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", harley_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", harleyId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", kagura_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", kaguraId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", lunox_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", lunoxId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", nana_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", nanaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });


        btn_view_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", odette_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", odetteId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", pharsa_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", pharsaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", valir_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", valirId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", vexana_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", vexanaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", zhask_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", zhaskId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", harith_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", harithId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", vale_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", valeId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });

        btn_view_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mage_Activity.this, Hero_Audio_Activity.class);
                Bundle hero_bundle = new Bundle();
                hero_bundle.putStringArray("audio", kadita_audio);
                Bundle files_bundle = new Bundle();
                files_bundle.putIntArray("files", kaditaId);
                intent.putExtras(hero_bundle);
                intent.putExtras(files_bundle);
                startActivity(intent);

            }
        });
    }
}
