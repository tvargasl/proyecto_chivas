/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JEFERSON
 */
public class Tour extends Servicio{
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //Usa el constructor de servicio sin el horario
    public Tour(int servicio_id, String imagen, int aforoDisponible, int precio, String descripcion) {
        super(servicio_id, imagen, aforoDisponible, precio);
        this.descripcion = descripcion;
    }
    
}
