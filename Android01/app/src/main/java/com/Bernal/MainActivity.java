package com.Bernal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText cajaNumero;
    private TextView cajaResultado;
    //private ListView listado;
    //private ArrayList<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaNumero = findViewById(R.id.entradaDatos);
        cajaResultado = findViewById(R.id.mostrarDatos);
        //listado = findViewById(R.id.listado);
        //names = new ArrayList<String>();
    }

    public void anadirDatos(View vista)
    {
        //names.add(cajaNombre.getText().toString());

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        //listado.setAdapter(adapter);

        if(cajaNumero.getText().length() != 0) {
            int num = Integer.parseInt(cajaNumero.getText().toString());

            int numVisible = Integer.parseInt(cajaResultado.getText().toString());

            String resul = "" + (num + numVisible);

            cajaResultado.setText(resul);

            cajaNumero.setText("");
        }



    }
}
