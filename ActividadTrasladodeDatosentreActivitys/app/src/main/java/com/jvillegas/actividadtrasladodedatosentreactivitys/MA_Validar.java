package com.jvillegas.actividadtrasladodedatosentreactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MA_Validar extends AppCompatActivity {
    private TextView mAnio,anioR;
    private TextView monthY, weekY,dayY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_validar);

        mAnio=findViewById(R.id.lblAnio);
        anioR=findViewById(R.id.txtAnioR);
        monthY=findViewById(R.id.txtMeses);
        weekY=findViewById(R.id.txtSemanas);
        dayY=findViewById(R.id.txtDias);

        this.validaAnio();
    }

    // funcion que
    private void validaAnio(){
        Bundle bun=getIntent().getExtras();

        if(bun!=null){
            String oAnio=bun.getString("anio");

            //mostrar datos
            mAnio.setText("Año:>"+oAnio);

            if(validaBiciesto(Integer.parseInt(oAnio))){
                anioR.setText("[ Biciesto ]");
            }else{
                anioR.setText("[ No es Biciesto ]");
            }

            monthY.setText(""+this.meses());
            weekY.setText(""+this.semanas(Integer.parseInt(oAnio)));
            dayY.setText(""+this.dias(Integer.parseInt(oAnio)));

        }// fin de la condicional

    }// fin de la funcion que valida el anio
    private int meses(){
        return 12;
    }

    // calcular semanas del anio
    private int semanas(int anio){

        Calendar cal= Calendar.getInstance();
        cal.set(Calendar.YEAR,anio);
        cal.set(Calendar.MONTH,Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH,31);
        int ordinalDay=cal.get(Calendar.DAY_OF_YEAR);
        int weekDay=cal.get(Calendar.DAY_OF_WEEK)-1;
        int numberOfWeeks=(ordinalDay-weekDay +10)/7;

        return numberOfWeeks;
    }// fin del metodo calcular semanas

    private int dias(int anio){
        if(validaBiciesto(anio)){
            return 366;
        }else{
            return 365;
        }
    }


    // funcion que valida si un anio es biciesto
    private boolean validaBiciesto(int anio){
        if(anio%4==0 && !(anio%100==0) || anio%400==0){
            return true;
        }else{
            return false;
        }
    }// fin de la funcion





    public void ejecutar(View view) {
        onBackPressed();
    }
}