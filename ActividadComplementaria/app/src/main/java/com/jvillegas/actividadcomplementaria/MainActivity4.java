package com.jvillegas.actividadcomplementaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    private EditText field1, field2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        field1=findViewById(R.id.txtM1);
        field2=findViewById(R.id.txtM2);
        result=findViewById(R.id.txtMultiR);
    }

    private void multiplicar(){
        String num1=field1.getText().toString();
        String num2=field2.getText().toString();

        //validacion
        if(!num1.isEmpty() && !num2.isEmpty()){
            int multi=Integer.parseInt(num1)*Integer.parseInt(num2);
            result.setText("Multiplicacion:> "+multi);
        }else{
            Toast.makeText(this,"Campos Vacios",Toast.LENGTH_SHORT).show();
        }
    }


    public void onClick(View view) {
        // boton multiplicar
        if(view.getId()==R.id.btnMultiplicar){
            this.multiplicar();
        }
    }
}