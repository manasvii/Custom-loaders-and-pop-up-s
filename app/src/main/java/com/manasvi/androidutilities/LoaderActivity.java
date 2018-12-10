package com.manasvi.androidutilities;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

import com.agrawalsuneet.loaderspack.loaders.CircularSticksLoader;
import com.agrawalsuneet.loaderspack.loaders.CurvesLoader;

public class LoaderActivity extends AppCompatActivity {
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void circularLoader(Context ctx, int sticks, Float outerCircleRad, Float innerCircleRad, int visible) {
        CircularSticksLoader loader = new CircularSticksLoader(ctx, sticks,
                outerCircleRad, innerCircleRad,
                ContextCompat.getColor(ctx, R.color.blue),
                ContextCompat.getColor(ctx, R.color.red),
                ContextCompat.getColor(ctx, android.R.color.white));

        loader.setVisibility(visible);
        loader.setShowRunningShadow(true);
        loader.setFirstShadowColor(ContextCompat.getColor(this, R.color.green));
        loader.setSecondShadowColor(ContextCompat.getColor(this, R.color.yellow));
        loader.setAnimDuration(100);

        container.addView(loader);
    }

    public void curvesLoader(Context ctx, int sticks, int outerCircleRad, int innerCircleRad, int distBetweenCurves,
                             Float curveSweepAngle, int visible) {
        CurvesLoader curvesLoader = new CurvesLoader(
                ctx,
                sticks,
                outerCircleRad,
                innerCircleRad,
                distBetweenCurves,
                curveSweepAngle,
                ContextCompat.getColor(this, R.color.blue));


        curvesLoader.setVisibility(visible);
        curvesLoader.setAnimDuration(1000);
        curvesLoader.setInterpolator(new LinearInterpolator());

        container.addView(curvesLoader);
    }
}
