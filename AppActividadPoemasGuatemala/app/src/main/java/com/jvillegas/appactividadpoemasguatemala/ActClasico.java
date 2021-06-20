package com.jvillegas.appactividadpoemasguatemala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActClasico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_clasico);
    }

    public void mClaRet(View view) {
        onBackPressed();
    }
}