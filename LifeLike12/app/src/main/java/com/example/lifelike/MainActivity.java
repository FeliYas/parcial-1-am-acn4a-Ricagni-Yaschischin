package com.example.lifelike;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Código primer botón

       // Button button = findViewById(R.id.button);
       // button.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View button) {
            //    LinearLayout content = findViewById(R.id.content);
             //   TextView newText = new TextView(button.getContext());
             //   newText.setText(R.string.newtext);
             //   content.addView(newText);
          //  }
      //  });

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear un Intent para cambiar de Activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Iniciar la nueva Activity
                startActivity(intent);
            }
        });



        // Código segundo botón
        Button btnClickMe = findViewById(R.id.button4);
        TextView textResult = findViewById(R.id.textResult);
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textResult.setText("¡Redirigiendote para que te puedas Registrar!");
            }
        });
    }




}