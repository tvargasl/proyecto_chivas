/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JEFERSON
 */

public class Pasajero extends Cliente{
    private long identificacion;
    private List<Object> servicios = new LinkedList<>();
    
    private Pasajero(){}
    
    public Pasajero(long identificacion){
        this.identificacion = identificacion;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public List<Object> getServicios() {
        return servicios;
    }
    
    public void comprarServicio(Object servicio,long numero, String nombre, int cvv, String fechaVencimiento){
        //Se comprueban los datos de la tarjeta de credito 
        //Se comprueba si el servicio es Viaje, si es menor de edad, que tenga acompañante
        //Se agrega el nuevo servicio
        servicios.add(servicio);
        //Se actualiza la db
    }
    
    public void ampliarPaquete(Object servicio,HashMap producto){
        if (servicio instanceof Viaje){
            Viaje viaje = (Viaje) servicio;
            //Busca el paquete dentro de los servicios adquiridos por el pasajero se pone el condicional para
            //Hacer referencia de que se deben castear (Viaje) (Paquete) los objetos retornados por la busquedad
            Paquete paquete = (Paquete) viaje.getPaquete();
            paquete.borrarProducto(producto);
        }else{
            ChivaParaRumba chivaParaRumba = (ChivaParaRumba) servicio;
            //Busca el paquete dentro de los servicios adquiridos por el pasajero se pone el condicional para
            //Hacer referencia de que se deben castear (ChivaParaRumba) (Paquete) los objetos retornados por la busquedad
            Paquete paquete = (Paquete) chivaParaRumba.getPaquete();
            paquete.borrarProducto(producto);
        }
    }
    
    public void cancelarServicio(Object servicio){
        //Busca el servicio dentro de la lista de servicios y lo remueve
        if(servicios.size() == 1){
            //Se actualiza la db eliminando el pasajero
            if(servicio instanceof Viaje){
                servicio = (Viaje) servicio;
                //Se usa el metodo remove de forma representativa, ya que la clase LinkedList contiene nodos
                //Y antes de usar el remove primero toca buscar en cual nodo se encuentra el servicio a eliminar
                servicios.remove(servicio);
            }else{
                servicio = (ChivaParaRumba) servicio;
                //Se usa el metodo remove de forma representativa, ya que la clase LinkedList contiene nodos
                //Y antes de usar el remove primero toca buscar en cual nodo se encuentra el servicio a eliminar
                servicios.remove(servicio);
            }
        }else{
            if(servicio instanceof Viaje){
                servicio = (Viaje) servicio;
                //Se usa el metodo remove de forma representativa, ya que la clase LinkedList contiene nodos
                //Y antes de usar el remove primero toca buscar en cual nodo se encuentra el servicio a eliminar
                servicios.remove(servicio);
            }else{
                servicio = (ChivaParaRumba) servicio;
                //Se usa el metodo remove de forma representativa, ya que la clase LinkedList contiene nodos
                //Y antes de usar el remove primero toca buscar en cual nodo se encuentra el servicio a eliminar
                servicios.remove(servicio);
            }
        }
    }
}
