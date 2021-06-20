package com.jvillegas.appactividadpoemasguatemala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActPatria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_patria);
    }

    public void mPatRet(View view) {
        onBackPressed();
    }
}