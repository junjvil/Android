package com.jvillegas.myapp_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorGrid extends BaseAdapter {
    // Declaracion de variables
    private Context cont;
    private int ref;
    private ArrayList<String> nom=new ArrayList<>();
    private ArrayList<Integer> img=new ArrayList<>();

    public AdaptadorGrid(Context cont, int ref, ArrayList<String> nom, ArrayList<Integer> img) {
        this.cont = cont;
        this.ref = ref;
        this.nom = nom;
        this.img = img;
    }// fin del constructor de la clase

    @Override
    public int getCount() {
        return nom.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;

        LayoutInflater layoutInflater=LayoutInflater.from(this.cont);
        v=layoutInflater.inflate(R.layout.grid_personalizado,null);

        String n=this.nom.get(position);
        int i=this.img.get(position);

        TextView fieldNombre;
        ImageView fieldImag;

        fieldNombre=v.findViewById(R.id.txtGrid);
        fieldImag=v.findViewById(R.id.imgGrid);

        fieldNombre.setText(String.valueOf(n));
        fieldImag.setImageResource(i);

        return v;
    }// fin del metodo getView
}
