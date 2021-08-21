package com.jvillegas.myappactiontoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.img);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("Barra de Accion");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.item1:
                Toast.makeText(this, "Hola soy item 1 ", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.ic_girl);
                break;

            case R.id.item2:
                Toast.makeText(this, "Hola soy item 2", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.ic_groceries);
                break;

            case R.id.item3:
                Toast.makeText(this, "Hola soy item 3", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.ic_presents);
                break;

            case R.id.item4:
                Toast.makeText(this, "Hola soy item 4", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.ic_shopping_cart);
                break;

        }// fin de la toma condicionales


        return super.onOptionsItemSelected(item);
    }
}