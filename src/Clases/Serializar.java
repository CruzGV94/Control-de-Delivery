package Clases;
import java.io.*;
import java.util.ArrayList;
public class Serializar {
    
    public static void serializarProductos(ArrayList<Productos> productos, String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(productos);
            System.out.println("Productos serializados y guardados en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Productos> deserializarProductos(String nombreArchivo) {
        ArrayList<Productos> productos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            productos = (ArrayList<Productos>) ois.readObject();
            System.out.println("Productos deserializados desde " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productos;
    }
    
}
