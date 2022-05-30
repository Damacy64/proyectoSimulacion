package proyecto_simulacion;

import javax.swing.JFrame;
/**
 *
 * @author pzx64
 */
public class Main {
    public static void main(String[] args) {
        Grafico grafico = new Grafico();
        JFrame ventana = new JFrame();
        ventana.add(grafico);
        ventana.setTitle("Proyecto Simulacion");
        ventana.setSize(1000, 750);
        ventana.setVisible(true);
    }
}
