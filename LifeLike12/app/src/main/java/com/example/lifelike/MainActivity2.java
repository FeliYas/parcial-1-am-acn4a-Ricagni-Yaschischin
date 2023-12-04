package com.example.lifelike;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Obtén la vista principal de la actividad
        View contextView = findViewById(android.R.id.content);

        // Agrega un botón en tu diseño (puedes cambiarlo según tu diseño)
        ImageView heartButton = findViewById(R.id.imageButton);
        ImageView sueñoButton = findViewById(R.id.imageButton4);
        ImageView estresButton = findViewById(R.id.imageButton5);
        ImageView pesoButton = findViewById(R.id.imageButton6);

        // Agrega un Listener al botón
        heartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Muestra la Snackbar al hacer clic en el botón
                Snackbar.make(contextView, "Dirigiendose a la seccion 'Corazón'", Snackbar.LENGTH_LONG)
                        .setAction("Detalles", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Código a ejecutar cuando se hace clic en la acción de Snackbar
                                // (Puedes agregar más detalles aquí)
                            }
                        })
                        .show();
            }
        });


        // Agrega un Listener al botón
        sueñoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Muestra la Snackbar al hacer clic en el botón
                Snackbar.make(contextView, "Dirigiendose a la seccion 'Sueño'", Snackbar.LENGTH_LONG)
                        .setAction("Detalles", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Código a ejecutar cuando se hace clic en la acción de Snackbar
                                // (Puedes agregar más detalles aquí)
                            }
                        })
                        .show();
            }
        });


        // Agrega un Listener al botón
        estresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Muestra la Snackbar al hacer clic en el botón
                Snackbar.make(contextView, "Dirigiendose a la seccion 'Estres'", Snackbar.LENGTH_LONG)
                        .setAction("Detalles", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Código a ejecutar cuando se hace clic en la acción de Snackbar
                                // (Puedes agregar más detalles aquí)
                            }
                        })
                        .show();
            }
        });


        // Agrega un Listener al botón
        pesoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Muestra la Snackbar al hacer clic en el botón
                Snackbar.make(contextView, "Dirigiendose a la seccion 'Peso'", Snackbar.LENGTH_LONG)
                        .setAction("Detalles", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Código a ejecutar cuando se hace clic en la acción de Snackbar
                                // (Puedes agregar más detalles aquí)
                            }
                        })
                        .show();
            }
        });

    }
}

