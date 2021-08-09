package com.jvillegas.actividad_utilizacindegridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorPersonalizado extends BaseAdapter {
    Context context;
    int referencia;
    ArrayList<Integer> lImagen=new ArrayList<>();
    ArrayList<String> nombre=new ArrayList<>();
    ArrayList<Integer> vColor=new ArrayList<>();

    public AdaptadorPersonalizado(Context context, int referencia, ArrayList<Integer> lImagen, ArrayList<String> nombre,ArrayList<Integer> vColor) {
        this.context = context;
        this.referencia = referencia;
        this.lImagen = lImagen;
        this.nombre = nombre;
        this.vColor=vColor;
    }

    @Override
    public int getCount() {
        return this.nombre.size();
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
        View vista= convertView;
        LayoutInflater inflater= LayoutInflater.from(this.context);
        vista=inflater.inflate(R.layout.grid_personalizado,null);

        String nombre=this.nombre.get(position);
        int img=this.lImagen.get(position);
        int color=this.vColor.get(position);

        ImageView iVista=vista.findViewById(R.id.imgIcon);
        TextView tVista=vista.findViewById(R.id.lblColor);

        iVista.setImageResource(img);
        tVista.setText(String.valueOf(nombre));

        RelativeLayout rLayout=vista.findViewById(R.id.rltContenedor);
        rLayout.setBackgroundColor(color);

        return vista;
    }
}
