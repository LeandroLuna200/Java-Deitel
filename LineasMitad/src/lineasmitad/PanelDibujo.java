/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineasmitad;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Leandro
 */
public class PanelDibujo extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        
        int anchura= getWidth();
        int altura= getHeight();
        
        int pfAltura= 15;
        int pfAnchura= 0;
        while(pfAnchura < 15)
        {
            g.drawLine(0, 0, (anchura/15)*pfAnchura, (altura/15)*pfAltura);
            pfAnchura++;
            pfAltura--;
        }
        
        pfAltura= 0;
        pfAnchura= 0;
        while(pfAnchura < 15)
        {
            g.drawLine((anchura/15)*pfAnchura, (altura/15)*pfAltura, 0, altura);
            pfAnchura++;
            pfAltura++;
        }
        
        pfAltura= 15;
        pfAnchura= 0;
        while(pfAnchura < 15)
        {
            g.drawLine((anchura/15)*pfAnchura, (altura/15)*pfAltura, anchura, altura);
            pfAnchura++;
            pfAltura--;
        }
        
        pfAltura= 0;
        pfAnchura= 0;
        while(pfAnchura < 15)
        {
            g.drawLine((anchura/15)*pfAnchura, (altura/15)*pfAltura, anchura, 0);
            pfAnchura++;
            pfAltura++;
        }
    }   
}
