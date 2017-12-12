package edu.itla.tripdom.entity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import edu.itla.tripdom.R;
import edu.itla.tripdom.dao.UsuarioDbo;
import edu.itla.tripdom.listadapter.UsuarioListAdapter;
import edu.itla.tripdom.view.RegistroUsuario;

import static edu.itla.tripdom.dao.Dbconnection.LOG_T;

public class ListaUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuario);

        Button btnagregar = findViewById(R.id.btnagregar);
        ListView listView = findViewById(R.id.lvlistausuario);
        UsuarioDbo usuarioDbo = new UsuarioDbo(this);
        List<Usuario> usuarios = usuarioDbo.buscar ();
        listView.setAdapter(new UsuarioListAdapter(this , usuarios));
        Log.i(LOG_T, "Cantidad de usuario = " + usuarios.size());
        btnagregar. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registroUsuario = new Intent(ListaUsuario.this, RegistroUsuario.class);
                        startActivity(registroUsuario);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Usuario u = (Usuario)  adapterView.getItemAtPosition(i);
              Intent intent = new Intent(ListaUsuario. this, RegistroUsuario.class);
              intent.putExtra("usuario", u);
            }
        });
    }

}
