/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores.y.figuras.rellenas;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Leandro
 */
public class DibujarCaraSonriente extends JPanel{
    @Override
    public void paintComponent( Graphics g )
    {
        super.paintComponent(g);
        
        //dibujar la cara
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);
        
        //dibuja los ojos
        g.setColor(Color.black);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        //dibuja la boca
        g.fillOval(50, 110, 120, 60);
        
        //convierte la boca en una sonrisa
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
