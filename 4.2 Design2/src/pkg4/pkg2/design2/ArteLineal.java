/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg2.design2;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Leandro
 */
public class ArteLineal extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        
        int anchura= getWidth();
        int altura= getHeight();
        
        int pfAltura= 0;
        int pfAnchura= 0;
        while(pfAnchura < 15)
        {
            g.drawLine(0, (altura/15)*pfAltura, (anchura/15)*pfAnchura+15, altura);
            pfAnchura++;
            pfAltura++;
        }
        
        pfAltura= 15;
        pfAnchura= 0;
        while(pfAnchura < 15)
        {
            g.drawLine(0, (altura/15)*pfAltura, (anchura/15)*pfAnchura+15, 0);
            pfAnchura++;
            pfAltura--;
        }
        
        pfAltura= 15;
        pfAnchura= 15;
        while(pfAnchura > 0)
        {
            g.drawLine(anchura, (altura/15)*pfAltura, (anchura/15)*pfAnchura-15, 0);
            pfAnchura--;
            pfAltura--;
        }
        
        pfAltura= 0;
        pfAnchura= 15;
        while(pfAltura < 15)
        {
            g.drawLine(anchura, (altura/15)*pfAltura, (anchura/15)*pfAnchura-15, altura);
            pfAnchura--;
            pfAltura++;
        }
    } 
}
