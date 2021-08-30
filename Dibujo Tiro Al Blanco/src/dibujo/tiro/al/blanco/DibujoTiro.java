/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo.tiro.al.blanco;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.security.SecureRandom;

/**
 *
 * @author Leandro
 */
public class DibujoTiro extends JPanel{

    @Override
    public void paintComponent( Graphics g)
    {
        super.paintComponent(g);
        
        int anchura= getWidth();
        int altura= getHeight();
        
        SecureRandom numeroAleatorio= new SecureRandom();
        
        /** Para obtener la esquina superior izquierda de un círculo, 
        avance un radio hacia arriba y un radio a la izquierda, partiendo del 
        centro. La anchura y la altura del rectángulo delimitador es el diámetro 
        del círculo (el doble del radio). **/
        
        // generar los dos colores aleatorios
        Color colorTiro1= new Color( numeroAleatorio.nextInt(256), 
                numeroAleatorio.nextInt(256), 
                numeroAleatorio.nextInt(256));
        
        Color colorTiro2= new Color( numeroAleatorio.nextInt(256), 
                numeroAleatorio.nextInt(256), 
                numeroAleatorio.nextInt(256));
        
        int radio = anchura;
        int i= 0;
            
        int inicio= 0;
//        anchura -= inicio*2;
//        altura -= inicio*2;
        
        while( radio > 20 )
        {
            if( i % 2 == 0)
                g.setColor( colorTiro1);
            else
                g.setColor( colorTiro2);
            
            inicio += 40;
            anchura -= 80;
            altura -= 80;
            
            g.fillOval( inicio , inicio , anchura, altura);
            
            
            radio -= 20;
            
            i++;
        }
        
//        for( int j= 1; j <= 10; ++j)
//        {
//            g.drawOval( anchura/2 -20*j, altura/2 -20*j , 40*j, 40*j);
//        }
    }
}
