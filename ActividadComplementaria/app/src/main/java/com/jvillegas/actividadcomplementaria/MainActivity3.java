package com.jvillegas.actividadcomplementaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText n1,n2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        n1=findViewById(R.id.txtR1);
        n2=findViewById(R.id.txtR2);
        resultado=findViewById(R.id.txtRestaR);
    }

    private void restar(){
        String num1=n1.getText().toString();
        String num2=n2.getText().toString();

        if(!num1.isEmpty() && !num2.isEmpty()){
            int resta=Integer.parseInt(num1)-Integer.parseInt(num2);
            resultado.setText("Resta:> "+resta);
        }else{
            Toast.makeText(this,"Campos vacios",Toast.LENGTH_SHORT).show();
        }

    }

    public void onClick(View view) {
        // boton restar
        if (view.getId()==R.id.btnRestar){
            this.restar();
        }

    }// fin del metodo onClick
}