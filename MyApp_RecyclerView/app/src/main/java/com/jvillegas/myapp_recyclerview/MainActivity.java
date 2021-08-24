package com.jvillegas.myapp_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> lista=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.cargar();
    }// fin del onCreate
    private void cargar(){

        for (int i=0;i<=10;i++){
            lista.add("Item No. "+ i);

        }

    }



}