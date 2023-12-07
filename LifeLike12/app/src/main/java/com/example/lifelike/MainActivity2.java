package com.example.lifelike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    // Arreglo de textos para la sección de alimentación
    private String[] alimentacionTextos = {
            "-Variedad y equilibrio: Consume una amplia variedad de alimentos de todos los grupos alimenticios.\n",
            "-Porciones controladas: Controla el tamaño de las porciones para evitar el exceso de calorías.\n",
            "-Hidratación adecuada: Bebe suficiente agua a lo largo del día.\n",
            "-Limita alimentos procesados y azúcares añadidos: Reduzca la ingesta de alimentos altamente procesados y ricos en azúcares añadidos.\n",
            "-Planificación de comidas y snacks saludables: Planifica tus comidas y snacks con antelación para evitar opciones poco saludables cuando tengas hambre.\n"
            // Agrega más textos según sea necesario
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                // Obtiene la referencia al LinearLayout
                LinearLayout content = findViewById(R.id.content);

                // Limpia cualquier vista previa en el LinearLayout
                content.removeAllViews();

                // Recorre el arreglo de textos y agrega TextViews al LinearLayout
                for (String texto : alimentacionTextos) {
                    TextView newText = new TextView(button.getContext());
                    newText.setText(texto);
                    content.addView(newText);
                }
            }
        });

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


