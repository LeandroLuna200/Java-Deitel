/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores.y.figuras.rellenas;

import javax.swing.JFrame;

/**
 *
 * @author Leandro
 */
public class ColoresYFigurasRellenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DibujarCaraSonriente panel = new DibujarCaraSonriente();
        JFrame aplicacion= new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(250, 250);
        aplicacion.setVisible(true);
    }
    
}
