package edu.itla.tripdom.entity;

/**
 * Created by blare on 15/11/2017.
 */

public class PublicacionDetalle {
    public int id;
    public Publicacion publicacion;
    public String lugar;
    public String descripcion;
    public String imagen;

    public void setId(int id) {
        this.id = id;
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



    public String getLugar() {
        return lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
