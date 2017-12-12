package edu.itla.tripdom.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import edu.itla.tripdom.R;
import edu.itla.tripdom.dao.UsuarioActual;
import edu.itla.tripdom.dao.UsuarioDbo;
import edu.itla.tripdom.entity.TipoUsuario;
import edu.itla.tripdom.entity.Usuario;

public class RegistroUsuario extends AppCompatActivity {
    private static final String LOG_T = "RegistroUsuarioLog";
    Usuario usuario;
    UsuarioDbo dboUsuario = new UsuarioDbo(this);
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        Button btnSave = findViewById(R.id.btnSalvar);
        final EditText txtNombreUser = findViewById(R.id.txtnombre);
        final EditText txtEmail = findViewById(R.id.txtemail);
        final EditText txttelefono = findViewById(R.id.txttelefono);

        dboUsuario = new UsuarioDbo(this);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usuario == null) {
                    usuario = new Usuario();
                }
                Usuario bla = new Usuario();
                bla.setNombre(txtNombreUser.getText().toString());
                bla.setEmail(txtEmail.getText().toString());
                bla.setTelefono(txttelefono.getText().toString());
                bla.setTipoUsuario(TipoUsuario.CLIENTE);
                Log.i(LOG_T, bla.toString());

                dboUsuario.guardar(bla);
            }
        });

        // Button btnlistar = findViewById(R.id.btnlistar);
        // btnlistar.setOnClickListener(new View.OnClickListener() {
        // @Override
        // public void onClick(View view) {

        //   List<Usuario> usuarios = dboUsuario.buscar();
        // for (Usuario u: usuarios){
        //   Log.i("ListUsuarios", u.toString());


        Button btnCambiar = findViewById(R.id.btncambiar);
        btnCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usuario != null && usuario.getId() > 0) {

                    UsuarioActual.setUsuario(usuario);
                }
            }

        });


    }
}
