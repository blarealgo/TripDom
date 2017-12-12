package edu.itla.tripdom.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import edu.itla.tripdom.entity.TipoUsuario;
import edu.itla.tripdom.entity.Usuario;

/**
 * Created by blare on 26/11/2017.
 */

public class UsuarioDbo {
    private Dbconnection connection;
    public UsuarioDbo (Context context){
        connection = new Dbconnection(context);
    }

    public void guardar(Usuario usuario){

        ContentValues cv = new ContentValues ();
        cv.put("nombre", usuario.getNombre());
        cv.put("email", usuario.getEmail());
        cv.put("telefono", usuario.getTelefono());
        cv.put("tipo_usuario", usuario.getTipoUsuario().toString());


        SQLiteDatabase db = connection.getWritableDatabase();
        if (usuario.getId() <= 0) {
            Long id = db.insert("usuario", null, cv);
            usuario.setId(id.intValue());
        } else {
            db.update("usuario", cv, "id = "+ usuario.getId(), null);
        }

        db.close();
    }


    public List<Usuario> buscar (){
        // Lista donde se van ir agregando los usuarios.
        List<Usuario> usuarios = new ArrayList<>();

        //Columnas a buscar en la base de datos.
        String columnas[] = new String[] {"id", "nombre", "email", "telefono", "tipo_usuario"};

        // abrir conexion a la base de datos (SOLO LECTURA).
        SQLiteDatabase db = connection.getWritableDatabase();

        // ejecutamos el consulta.
        Cursor cursor = db.query("usuario", columnas, null, null, null, null, null);

                cursor.moveToFirst();
                while (!cursor.isAfterLast()){

                    Usuario u = new Usuario();
                    u.setId(cursor.getInt(cursor.getColumnIndex("id")));
                    u.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));
                    u.setEmail(cursor.getString(cursor.getColumnIndex("email")));
                    u.setTelefono(cursor.getString(cursor.getColumnIndex("telefono")));
                    u.setTipoUsuario(TipoUsuario.valueOf(cursor.getString(cursor.getColumnIndex("tipo_usuario"))));

                    usuarios.add(u);

                    cursor.moveToNext();
                }
        db.close();

        return usuarios;

    }
}
