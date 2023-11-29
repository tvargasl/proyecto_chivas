/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JEFERSON
 */
public class ChivaParaRumba extends Servicio{
    private Paquete paquete;

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    //Constructor ChivaParaRumba con paquete
    public ChivaParaRumba(String imagen, int aforoDisponible, String horario, int precio, Paquete paquete) {
        super(imagen,aforoDisponible,horario,precio);
        super.tipo = "ChivaRumba";
        this.paquete = paquete;
    }
    //Constructor ChivaParaRumba sin paquete
    public ChivaParaRumba(String imagen, int aforoDisponible, String horario, int precio) {
        super(imagen,aforoDisponible,horario,precio);
        super.tipo = "ChivaRumba";
        this.paquete = null;
    }
}
