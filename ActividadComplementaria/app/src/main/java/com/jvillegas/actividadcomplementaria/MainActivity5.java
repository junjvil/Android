package com.jvillegas.actividadcomplementaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    private EditText txt1, txt2;
    private TextView txtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        txt1=findViewById(R.id.txtD1);
        txt2=findViewById(R.id.txtD2);
        txtR=findViewById(R.id.txtDiviR);
    }

    private void divide(){
        String n1=txt1.getText().toString();
        String n2=txt2.getText().toString();

        if(!n1.isEmpty() && !n2.isEmpty()){
            int divide=Integer.parseInt(n1)/Integer.parseInt(n2);
            txtR.setText("Division:> "+divide);

        }else{
            Toast.makeText(this, "Campos vacios", Toast.LENGTH_SHORT).show();
        }

    }// fin del metodo divide

    public void onClick(View view) {
        if (view.getId()==R.id.btnDividir){
            this.divide();
        }
    }
}