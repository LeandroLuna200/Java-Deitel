/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujorectangulosyovalos;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Leandro
 */
public class Figuras extends JPanel{
    private final int opcion;
    
    //el constructor establece la opcion del usuario
    public Figuras(int opcionUsuario)
    {
        opcion= opcionUsuario;
    }
    //dibuja una cascada de figuras, empezando en la esquina superior izquierda
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for( int i= 0; i < 10 ; i++)
        {
            switch( opcion )
            {
                case 1: //dibuja rectangulos
                    g.drawRect(10 + i *10, 10 + i * 10, 
                               50+ i * 10, 50 + i * 10 );
                    break;
                case 2: //dibuja ovalos
                    g.drawOval(10 + i *10, 10 + i * 10, 
                               50+ i * 10, 50 + i * 10 );
                    break;
            }
        }
    }
}
