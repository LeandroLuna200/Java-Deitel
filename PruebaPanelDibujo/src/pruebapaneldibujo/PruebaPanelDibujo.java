/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapaneldibujo;

import javax.swing.JFrame;

/**
 *
 * @author Leandro
 */
// Crear un objeto JFrame para mostrar un objeto PanelDibujo
public class PruebaPanelDibujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea un panel que contiene nuestro dibujo
        PanelDibujo panel = new PanelDibujo();
        
        // crea un nuevo marco para contener el panel
        JFrame aplicacion = new JFrame();
        
        // establece el marco para salir cuando se cierre
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        aplicacion.add(panel);// agrega el panel al marco
        aplicacion.setSize(500, 500);// establece el tamaño del marco
        aplicacion.setVisible(true);  // hace que el marco sea visible
    }
}
