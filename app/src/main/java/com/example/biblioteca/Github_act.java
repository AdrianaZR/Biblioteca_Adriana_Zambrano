package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Github_act extends AppCompatActivity {

    private Spinner spinner;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        spinner = (Spinner)findViewById(R.id.spinner);
        texto = (TextView)findViewById(R.id.textView);

        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("listaLibros");
        ArrayAdapter<String> adapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaLibros);
        spinner.setAdapter(adapt);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String libro = spinner.getSelectedItem().toString();
                int valor=0;

                if(libro.equals("Fahrenheit")){
                    valor=7000;
                }
                else if(libro.equals("Revival")){
                    valor=22000;
                }
                else if (libro.equals("El Alquimista")){
                    valor = 45000;
                }

                else if (libro.equals("El Poder")){
                    valor = 88000;
                }

                else if (libro.equals("Despertar")){
                    valor = 156000;
                }

                texto.setText("El valor de "+libro +" es: "+valor);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }

        });

    }

public void Calcular()
{

    String libro = spinner.getSelectedItem().toString();
    int valor=0;

    if(libro.equals("Fahrenheit")){
        valor=5000;
    }
    else if(libro.equals("Revival")){
        valor=12000;
    }
    else if (libro.equals("El Alquimista")){
        valor = 45000;
    }

    texto.setText("El valor de "+libro +" es: "+valor);

}
}