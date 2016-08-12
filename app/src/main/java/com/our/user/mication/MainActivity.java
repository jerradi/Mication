package com.our.user.mication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// This methode to ensure time is syncked with user clicks
    private int countClicks(){
        return (int) Math.random()*1000+1;
    }
}
