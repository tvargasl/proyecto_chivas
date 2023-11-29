/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


/**
 *
 * @author JEFERSON
 */
public class Cliente {

    //Constructor Vacio
    public Cliente(){}
    
    public void comprarServicio(long identificacion,Object servicio,long numero, String nombre, int cvv, String fechaVencimiento){
        //Se comprueban los datos de la tarjeta de credito 
        //Se comprueba si el servicio es Viaje, si es menor de edad, que tenga acompañante
        //Se crea un nuevo pasajero con el servicio comprado
        Pasajero nuevoPasajero = new Pasajero(identificacion);
        nuevoPasajero.comprarServicio(servicio, numero, nombre, cvv, fechaVencimiento);
    }
    
    public void consultarChivasParaRumbaDisponibles(){
        //Muestra las chivas para rumba disponibles
    }
    public void consultarPaquetesDisponibles(){
        //Muestra los paquetes disponibles
    }
    public void consultarViajesDisponibles(){
        //Muestra los viajes disponibles
    }
    public void consultarToursDisponibles(){
        //Muestra los tours disponibles
    }
    
}
