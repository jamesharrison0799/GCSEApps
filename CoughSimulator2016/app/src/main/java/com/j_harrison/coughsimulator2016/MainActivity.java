package com.j_harrison.coughsimulator2016;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer phlemcough1;
    MediaPlayer shortcough;
    MediaPlayer mediumcough;
    MediaPlayer longcough;
    MediaPlayer extralongcough;
    MediaPlayer ultimatecough;
    MediaPlayer thewheeze;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView tx = (TextView)findViewById(R.id.title);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/comic.ttf");
        tx.setTypeface(custom_font);

        phlemcough1 = MediaPlayer.create(this, R.raw.phlegmcough1);
        shortcough = MediaPlayer.create(this, R.raw.shortcough);
        mediumcough = MediaPlayer.create(this, R.raw.mediumcough);
        longcough =  MediaPlayer.create(this, R.raw.longcough);
    }

    public void comingSoon (View v){
        Toast.makeText(this, "Coming Soon!", Toast.LENGTH_LONG).show();
    }
    public void phlegmCough1(View v){
        phlemcough1.start();
    }
    public void shortCough(View v){
        shortcough.start();
    }
    public void mediumCough(View v){
        mediumcough.start();
    }
    public void longCough(View v){
        longcough.start();
    }

}



/* TODO Coughs
    - Phlegm Cough 1 [Y]
    - Short Cough [Y]
    - Medium Cough [Y]
    - Long Cough [Y]
    - Extra long cough
    - Ultimate Cough
    - The Wheeze


 */
