package com.twinrat.woodforest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withBackgroundColor(Color.parseColor("#3e7a71"))
                .withFooterText("Made with ♡ in Houston,Texas")

                .withAfterLogoText("woodforest Spanish")
                .withLogo(R.mipmap.ic_launcher);

        //config.getLogo().setMinimumWidth(150);
        config.getLogo().getLayoutParams().height=150;
        config.getLogo().getLayoutParams().width=150;
        config.getLogo().setScaleType(ImageView.ScaleType.FIT_XY);
        config.getLogo().requestLayout();

        config.getFooterTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        View easySplashScreen = config.create();
        setContentView(easySplashScreen);

    }
}
