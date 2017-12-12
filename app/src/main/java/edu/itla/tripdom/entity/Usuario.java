package edu.itla.tripdom.entity;

import java.io.Serializable;

/**
 * Created by blare on 15/11/2017.
 */

public class Usuario implements Serializable {
    public int id;
    public String nombre;
    public TipoUsuario tipoUsuario;
    private String telefono;
    private String email;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}