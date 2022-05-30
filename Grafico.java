/*
Este programa crea un rectangulo el cual graficara cada uno de los numeros pseudoaleatorios
 */
package proyecto_simulacion;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Scanner;
/**
 *
 * @author pzx64
 */
public class Grafico extends JPanel{
    Scanner leer = new Scanner(System.in);
    public Grafico(){
        setBackground(new Color(255,123,123));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int a,b,c,d,aux1,aux2,aux3,aux4;
        a = (int) (Math.random()*1000);
        b = (int) (Math.random()*750);
        c = (int) (Math.random()*1000);
        d = (int) (Math.random()*750);
        aux1 = a;
        aux2 = b;
        g.drawLine(a, b, c, d);
        System.out.println("¿Cuantos numeros desea generar?");
        int contador = leer.nextInt();
        for(;contador > 0;contador--){
            a = c;
            b = d;
            c = (int) (Math.random()*1000);
            d = (int) (Math.random()*750);
            g.drawLine(a,b,c,d);
            a = (int) (Math.random()*1000);
            b = (int) (Math.random()*750);
        }
        g.drawLine(aux1,aux2,c,d);
    }
    
}
