package com.jvillegas.appventapint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MA_Vista_Compra extends AppCompatActivity {

    private ImageView imagenp;
    private TextView nombrep, preciop;
    private EditText nombrecl, apellidocl, nitcl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_vista_compra);
        imagenp=findViewById(R.id.imgPre);
        nombrep=findViewById(R.id.lblNombrePintura);
        preciop=findViewById(R.id.lblPrecioPintura);
        nombrecl=findViewById(R.id.txtNombre);
        apellidocl=findViewById(R.id.txtApellido);
        nitcl=findViewById(R.id.txtNit);
        cargarDatos();
    }
    private void cargarDatos(){
        Bundle bundle= getIntent().getExtras();
        this.imagenp.setImageResource(bundle.getInt("img"));
        this.nombrep.setText(bundle.getString("nm"));
        this.preciop.setText(String.valueOf(bundle.getFloat("prec")));
    }// fin del metodo cargar datos
    private void validar(){
        if(!nombrecl.getText().toString().isEmpty() && !apellidocl.getText().toString().isEmpty() || !nitcl.getText().toString().isEmpty()){
            Intent intent=new Intent(getApplicationContext(),MA_Compra.class);
            intent.putExtra("nmp",nombrep.getText().toString());
            intent.putExtra("prcp",preciop.getText().toString());
            intent.putExtra("nmc",nombrecl.getText().toString());
            intent.putExtra("apc",apellidocl.getText().toString());
            intent.putExtra("ntc",nitcl.getText().toString());
            startActivity(intent);
        }else{
            Toast.makeText(this, "Estos campos no pueden estar vacios ", Toast.LENGTH_SHORT).show();
            nombrecl.requestFocus();
        }

    }

    public void onClick(View view) {
        if(view.getId()==R.id.btnComprar){
            this.validar();
        }// fin del boton comprar



        if(view.getId()==R.id.btnCancelar){
            onBackPressed();
        }// fin del boton cancelar
    }
}