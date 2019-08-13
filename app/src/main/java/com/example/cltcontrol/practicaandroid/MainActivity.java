package com.example.cltcontrol.practicaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton_calculadora,boton_lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_calculadora = (Button)findViewById(R.id.button_calculadora);
        boton_lista=(Button)findViewById(R.id.boton_lista);

        boton_calculadora.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.calculadora_promedios);
            }

        });

        boton_lista.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.lista_de_excelencias);
                }
        });
    }
}
