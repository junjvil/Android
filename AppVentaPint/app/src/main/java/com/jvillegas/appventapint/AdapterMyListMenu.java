package com.jvillegas.appventapint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterMyListMenu extends BaseAdapter {

    // declaracin de campos && objetos
    private Context cnt;
    private int refe;
    ArrayList<String> objLst= new ArrayList<>();

    // constructor de la clase
    public AdapterMyListMenu(Context cnt, int refe,ArrayList<String> objLst) {
        this.cnt = cnt;
        this.refe=refe;
        this.objLst=objLst;

    }// fin del constructor de la clase

    // metodo creados por defecto de la clase BaseAdapter
    @Override
    public int getCount() {
        return this.objLst.size();
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
        View vista=convertView;
        LayoutInflater lyi=LayoutInflater.from(this.cnt);
        vista=lyi.inflate(R.layout.ma_lista_prmenu,null);

        String pos;
        pos=this.objLst.get(position);

        TextView field;

        field=vista.findViewById(R.id.txtList);
        field.setText(String.valueOf(pos));


        return vista;
    }
}
