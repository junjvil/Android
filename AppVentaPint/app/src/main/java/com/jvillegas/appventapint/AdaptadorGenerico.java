package com.jvillegas.appventapint;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdaptadorGenerico extends BaseAdapter {
    // declaracion de variables de instancia
    private Context context;
    private int referencia;
    ArrayList<String> autores=new ArrayList<>();
    ArrayList<Integer> imagenes=new ArrayList<>();
    ArrayList<String> cadenas=new ArrayList<>();
    ArrayList<Float> precios=new ArrayList<>();

    // se agrega el constructor de la clase
    public AdaptadorGenerico(Context context,int referencia,ArrayList<String> autores,ArrayList<Integer> imagenes,ArrayList<String> cadenas, ArrayList<Float> precios) {

        //asignando las variables
        this.context=context;
        this.referencia=referencia;
        this.autores=autores;
        this.imagenes=imagenes;
        this.cadenas=cadenas;
        this.precios=precios;

    }//fin del constructor de la clase

    @Override
    public int getCount() {
        return this.imagenes.size();
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
        Button llamarBoton;


        LayoutInflater lI=LayoutInflater.from(this.context);
        view=lI.inflate(R.layout.ma_formatos_cuadros,null);


        String aut=this.autores.get(position);
        int img=this.imagenes.get(position);
        String nms=this.cadenas.get(position);
        float prc=this.precios.get(position);

        TextView autor=view.findViewById(R.id.lblTitle);
        ImageView fielImg=view.findViewById(R.id.imgView);
        TextView title=view.findViewById(R.id.lblTit);
        TextView prec=view.findViewById(R.id.lblPrecio);
        llamarBoton=view.findViewById(R.id.btnBuy);
        llamarBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,MA_Vista_Compra.class);
                //intent.putExtra("ath",aut);
                intent.putExtra("img",img);
                intent.putExtra("nm",nms);
                intent.putExtra("prec",prc);
                 context.startActivity(intent);
//                Toast.makeText(context.getApplicationContext(), "Presionaste ", Toast.LENGTH_SHORT).show();
            } 
        });


        autor.setText(aut);
        fielImg.setImageResource(img);
        title.setText("Nombre:> "+String.valueOf(nms));
        prec.setText("Precio:> "+String.valueOf(prc));
        return view;
    }
}
