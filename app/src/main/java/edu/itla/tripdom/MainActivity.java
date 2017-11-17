package edu.itla.tripdom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNombre = findViewById(R.id.txtNombre);
        Button btnGuardar = (Button) findViewById(R.id.btnGuardar);

       btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                Intent vista = new Intent(MainActivity.this, Visualizar.class);
                vista.putExtra("Nombre", nombre);
                startActivity(vista);
            }
        });

    }
}
