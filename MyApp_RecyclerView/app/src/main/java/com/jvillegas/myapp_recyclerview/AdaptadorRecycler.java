package com.jvillegas.myapp_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.ViewHolder> {



    private ArrayList<String> lista =new ArrayList<>();

    public AdaptadorRecycler(ArrayList<String> lista) {
        this.lista = lista;
    }// fin del constructor de la clase

    @Override
    public AdaptadorRecycler.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,null,false);
        ViewHolder viewHolder=new ViewHolder(v); 
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRecycler.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
        }
    }
}// de la clase AdaptadorRecycler
