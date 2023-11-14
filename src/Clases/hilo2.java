package Clases;
import Form.Enviar;
import Form.ProductosFm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hilo2 extends Thread implements Serializable{

    @Override
    public void run() {
        int index = ProductosFm.contador;
        ProductosFm.contador += 1;
        
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("motorista3Vuelta.png"));
        Image img4 = imagen4.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("motorista3.png"));
        Image img5 = imagen5.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        LocalDateTime fechaHorainicio = LocalDateTime.now();
        ProductosFm.fechasinicio[index] = fechaHorainicio.format(formatter);
        ProductosFm.nombre[index] = "Moto2";
        ProductosFm.distancias[index] = String.valueOf(ProductosFm.distancia[1]);
        
        int valorx = Enviar.jLabelim2.getX();
        int valory = Enviar.jLabelim2.getY();
        while (true) {            
            Enviar.jLabelim2.setBounds(valorx, valory, 100, 100);
            valorx = valorx + (5);
            Enviar.jLabelim2.setIcon(new ImageIcon(img5));
            try {
                Thread.sleep(10*ProductosFm.distancia[1]);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloIm1.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (valorx > 700){
                break;
            }
        }
        Enviar.jLabelim2.setIcon(new ImageIcon(img4));
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(hilo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (true) {            
            Enviar.jLabelim2.setBounds(valorx, valory, 100, 100);
            valorx = valorx - (5);
            Enviar.jLabelim2.setIcon(new ImageIcon(img4));
            try {
                Thread.sleep(10*ProductosFm.distancia[1]);
            } catch (InterruptedException ex) {
                Logger.getLogger(hilo2.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (valorx < 120){
                break;
            }
        }
        LocalDateTime fechaHorafinal = LocalDateTime.now();
        ProductosFm.fechasfinal[index] = fechaHorafinal.format(formatter);
        
        Enviar.jLabelim2.setIcon(new ImageIcon(img5));
        
    }
}
