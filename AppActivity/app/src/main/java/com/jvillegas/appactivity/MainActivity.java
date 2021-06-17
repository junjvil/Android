package com.jvillegas.appactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Operacion OnCreate MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Operacion OnStart MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Operacion OnReset MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Operacion OnStop MainActivity",Toast.LENGTH_SHORT).show();
    }

    // se activa cuando se cirera la aplicacion

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Operacion OnDestroy MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Operacion OnPause MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Opearcion OnResumen MainActivity",Toast.LENGTH_SHORT).show();
    }

    public void Cambio(View view) {
        Intent inte=new Intent(this,OtherActivity.class);
        startActivity(inte);
    }
}