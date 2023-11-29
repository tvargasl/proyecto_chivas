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
public class Paquete {
    private int paquete_id;
            
    private String descripcion;
    private int precio;
    private List<HashMap> productos;

    private Paquete(){}
    
    public Paquete(int paquete_id, String descripcion, int precio, LinkedList<HashMap> productos){
        this.paquete_id = paquete_id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.productos = productos;
    }
    
    public int getID() {
        return paquete_id;
    }
    
    public void setID(int paquete_id) {
        this.paquete_id = paquete_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public List<HashMap> getProductos() {
        return productos;
    }

    public Paquete(String descripcion, int precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public void añadirProducto(HashMap producto){
        productos.add(producto);
        //Se actualiza la db
    }
    
    public void borrarProducto(HashMap producto){
        productos.remove(producto);
        //Se actualiza la db
    }        
}
