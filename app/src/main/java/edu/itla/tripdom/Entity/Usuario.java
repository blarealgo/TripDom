package edu.itla.tripdom.Entity;

/**
 * Created by blare on 15/11/2017.
 */

public class Usuario {
    public int id;
    public String nombre;
    public String tipo_usuario;
    public String imagen;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public String getImagen() {
        return imagen;
    }
}
