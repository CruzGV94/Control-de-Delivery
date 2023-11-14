package Clases;

import javax.swing.JLabel;

public class Mover extends Thread{
    
    JLabel imagen1;
    JLabel imagen2;
    JLabel imagen3;
    int velocidad;
    
    public Mover(JLabel imagen1, JLabel imagen2, JLabel imagen3, int velocidad) {
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.velocidad = velocidad;
    }
    
     public void run() {

        /*
        int rangoMaximo = 100; 
        velocidad = (int) (Math.random() * rangoMaximo) + 50;
        */

        for (int i = 0; i <= 638; i++) {


            imagen1.setLocation(imagen1.getX()+1, imagen1.getY());
//            imagen2.setLocation(imagen2.getX()+1, imagen2.getY());
//            imagen3.setLocation(imagen3.getX()+1, imagen3.getY());

            try {
                Thread.sleep(1000/velocidad);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }

    public void detener() {
        this.stop();
    }
}
