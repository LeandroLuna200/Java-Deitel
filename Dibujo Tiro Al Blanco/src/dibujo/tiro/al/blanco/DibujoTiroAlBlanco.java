/*
 6.1 Con el método fillOval, dibuje un tiro al blanco que alterne entre dos 
colores aleatorios, como en la figura 6.13. Use el constructor 
Color(int r, int g, int b)con argumentos aleatorios para generar colores 
aleatorios.
 */
package dibujo.tiro.al.blanco;

import javax.swing.JFrame;

/**
 *
 * @author Leandro
 */
public class DibujoTiroAlBlanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DibujoTiro panel= new DibujoTiro();
        JFrame aplicacion= new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(250, 250);
        aplicacion.setVisible(true);
    }
    
}
