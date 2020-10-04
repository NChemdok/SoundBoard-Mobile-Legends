package com.slothychemdoksloth.mobilelegendssoundboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Help_Activity extends AppCompatActivity {

    TextView text_help, text_disclaim, text_email, text_contact;

    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_);

        MobileAds.initialize(this,"ca-app-pub-7717760204588800~8036911192");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        text_help = findViewById(R.id.helptext);
        text_disclaim = findViewById(R.id.disclaim);
        text_email = findViewById(R.id.email);
        text_contact = findViewById(R.id.contact);

        text_help.setText("DISCLAIMER");
        text_disclaim.setText("The Developer does not claim ownership of the images and illustrations in the app. All logos/images/sounds belong to the original owners (Moonton) . This app is unofficial and is not endorsed by Moonton, all the images/audios are used purely and only for artistic and aesthetic purposes. No copyright violation & infringement are intended. If the rightful owner of the content within the app wishes to have this app taken down then the developer will comply.");

        text_email.setText("APP DEVELOPED BY - SLOWTHY SLOTH");
        text_contact.setText("For Suggestions or Bug Reports Contact me at slothychemdoksloth@gmail.com");
    }
}
