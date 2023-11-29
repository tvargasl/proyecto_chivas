/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JEFERSON
 */

public class Servicio {
    protected int servicio_id;
    
    protected String imagen;
    protected int aforoDisponible;
    protected String horario;
    protected int precio;
    protected String tipo;

    private Servicio(){}
    
    //Constructor Servicio con horario
    public Servicio(int servicio_id,String imagen, int aforoDisponible, String horario, int precio) {
        this.servicio_id = servicio_id;
        this.imagen = imagen;
        this.aforoDisponible = aforoDisponible;
        this.horario = horario;
        this.precio = precio;
    }
    //Constructor Servicio sin horario
    public Servicio(int servicio_id, String imagen, int aforoDisponible, int precio) {
        this.servicio_id = servicio_id;
        this.imagen = imagen;
        this.aforoDisponible = aforoDisponible;
        this.precio = precio;
    }
    public int getID() {
        return servicio_id;
    }
    
    public void setID(int servicio_id) {
        this.servicio_id = servicio_id;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getAforoDisponible() {
        return aforoDisponible;
    }

    public void setAforoDisponible(int aforoDisponible) {
        this.aforoDisponible = aforoDisponible;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
