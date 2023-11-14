package Clases;
import java.io.Serializable;

public class Productos implements Serializable{
   
    private String nombre;
    private double precio;
    private int distancia;

    public Productos() {
    }

    public Productos(String nombre, double precio, int distancia) {
        this.nombre = nombre;
        this.precio = precio;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    

    @Override
    public String toString() {
        return "Q" + getPrecio();
    }
    
    
   
}
