package edu.itla.tripdom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by blare on 15/11/2017.
 */

public class Publicacion {
    public int id;
    public Date fecha;
    public Date fechaViaje;
    public float costo;
    public String descripcion;
    public String estado;
    public Usuario usuario;
    public String origen;
    public String imagen;
    public int cupo;
     List <PublicacionDetalle> detalle;

    public List<PublicacionDetalle> getDetalle() {
        return detalle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setFecha_viaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstatus(String estado) {
        this.estado = estado;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public float getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public Usuario getUsuario() {
        return usuario;
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

    public void addDetalle (PublicacionDetalle pd) {
        if (detalle == null){
            detalle = new ArrayList();
        }
        pd.setPublicacion(this);
        detalle.add (pd);

    }
}
