/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JEFERSON
 */

public class Viaje extends Servicio{
    private String[] salidaYdestino;
    private Tour tour;
    private Paquete paquete;

    public String[] getSalidaYdestino() {
        return salidaYdestino;
    }

    public Tour getTour() {
        return tour;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    //Constructor viaje con paquete y tour
    public Viaje(int servicio_id, String imagen, int aforoDisponible, String horario, int precio, String[] salidaYdestino, Tour tour, Paquete paquete) {
        super(servicio_id,imagen,aforoDisponible,horario,precio);
        super.tipo = "Viaje";
        this.salidaYdestino = salidaYdestino;
        this.tour = tour;
        this.paquete = paquete;
    }
    //Constructor viaje sin paquete y tour
    public Viaje(int servicio_id,String imagen, int aforoDisponible, String horario, int precio, String[] salidaYdestino) {
        super(servicio_id,imagen,aforoDisponible,horario,precio);
        super.tipo = "Viaje";
        this.salidaYdestino = salidaYdestino;
        this.paquete = null;
        this.tour = null;
    }
    //Constructor viaje con tour
    public Viaje(int servicio_id, String imagen, int aforoDisponible, String horario, int precio, String[] salidaYdestino, Tour tour) {
        super(servicio_id,imagen,aforoDisponible,horario,precio);
        super.tipo = "Viaje";
        this.salidaYdestino = salidaYdestino;
        this.tour = tour;
        this.paquete = null;
    }
    //Constructor viaje con paquete
    public Viaje(int servicio_id,String imagen, int aforoDisponible, String horario, int precio, String[] salidaYdestino, Paquete paquete) {
        super(servicio_id,imagen,aforoDisponible,horario,precio);
        super.tipo = "Viaje";
        this.salidaYdestino = salidaYdestino;
        this.paquete = paquete;
        this.tour = null;
    } 
}
