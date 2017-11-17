package edu.itla.tripdom.Entity;

/**
 * Created by blare on 15/11/2017.
 */

public class PublicacionDetalle {
    public int id;
    public int publicacion_id;
    public String lugar;
    public String descripcion;
    public String imagen;

    public void setId(int id) {
        this.id = id;
    }

    public void setPublicacion_id(int publicacion_id) {
        this.publicacion_id = publicacion_id;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public int getPublicacion_id() {
        return publicacion_id;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }
}
