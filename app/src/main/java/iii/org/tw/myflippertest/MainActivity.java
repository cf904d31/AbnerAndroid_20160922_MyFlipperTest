package iii.org.tw.myflippertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private ViewFlipper viewflipper;
    private Animation animInLeftRight, animInRightLeft, animOutLeftRight, animOutRightLeft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animInLeftRight = AnimationUtils.loadAnimation(this, R.anim.in_leftright);
        animOutLeftRight = AnimationUtils.loadAnimation(this, R.anim.out_leftright);

        viewflipper = (ViewFlipper) findViewById(R.id.viewflipper);


        viewflipper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                viewflipper.setInAnimation(animInLeftRight);
                viewflipper.setOutAnimation(animOutLeftRight);
                viewflipper.showNext();
                return false;
            }
        });

    }
}
