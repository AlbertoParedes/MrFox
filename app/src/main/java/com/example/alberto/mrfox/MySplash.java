package com.example.alberto.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.activity_my_splash);


        TextView myTitle = (TextView)findViewById(R.id.Title);
        ImageView myImage = (ImageView)findViewById(R.id.imageView);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.hacialaderecha);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.leftin);

        myImage.startAnimation(myanim);
        myTitle.startAnimation(myanim2);

        myanim2.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(MySplash.this, MyLogin.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
