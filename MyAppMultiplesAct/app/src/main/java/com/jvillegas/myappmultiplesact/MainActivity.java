package com.jvillegas.myappmultiplesact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsar(View view) {
        Intent intent=new Intent(this,MAIntermedio.class);
        startActivity(intent);
        finish();
    }
}