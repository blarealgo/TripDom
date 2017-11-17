package edu.itla.tripdom.Entity;

import android.graphics.Bitmap;

import java.util.Date;

/**
 * Created by blare on 15/11/2017.
 */

public class Publicacion {
    public int id;
    public Date fecha;
    public Date fecha_viaje;
    public float costo;
    public String descripcion;
    public boolean estatus;
    public int usuario_id;
    public String origen;
    public String imagen;
    public int cupo;

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setFecha_viaje(Date fecha_viaje) {
        this.fecha_viaje = fecha_viaje;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getId() {

        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getFecha_viaje() {
        return fecha_viaje;
    }

    public float getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public String getOrigen() {
        return origen;
    }

    public String getImagen() {
        return imagen;
    }

    public int getCupo() {
        return cupo;
    }
}
