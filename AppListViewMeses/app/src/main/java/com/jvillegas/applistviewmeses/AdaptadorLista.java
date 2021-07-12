package com.jvillegas.applistviewmeses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorLista extends BaseAdapter {

    private Context contexto;
    private int referenciaLista;
    private ArrayList<String> dato = new ArrayList<>();
    private ArrayList<Integer> num = new ArrayList<>();
    private ArrayList<Integer> datos = new ArrayList<>();

    public AdaptadorLista(Context contexto,int referenciaLista, ArrayList<String> dato,ArrayList<Integer> num) {
        this.contexto=contexto;
        this.referenciaLista=referenciaLista;
        this.dato=dato;
        this.num = num;

    }// fin del construcctor

    @Override
    public int getCount() {
        return this.dato.size();
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
        View view=convertView;
        LayoutInflater layoutInflater= LayoutInflater.from(this.contexto);
        view=layoutInflater.inflate(R.layout.ma_vista_personalizada,null);

        String mes;
        int numero;
        mes=this.dato.get(position);
        numero=this.num.get(position);

        TextView campo;
        TextView numo;

        campo=view.findViewById(R.id.txtLista);
        numo=view.findViewById(R.id.txtNum);

        campo.setText(String.valueOf(mes));
        numo.setText(String.valueOf(numero));

        return view;
    }
}
