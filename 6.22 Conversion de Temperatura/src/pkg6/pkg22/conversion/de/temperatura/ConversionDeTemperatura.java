/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg22.conversion.de.temperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class ConversionDeTemperatura {
    public static void main(String[] args) {
        
        String entrada= JOptionPane.showInputDialog("Ingrese una temperatura: ");
        double temperatura = Double.parseDouble(entrada);
        
        String opcion= JOptionPane.showInputDialog(
                "Ingrese 1 para convertir a Centigrados " +
                "o 2 para convertir a Fahrenheit");
        int conversion = Integer.parseInt(opcion);
        
        switch( conversion )
        {
            case 1:
                System.out.printf("%.2f fahrenheit en centrigrados es: %.2f%n", 
                        temperatura, fahrenheitACentrigrados( temperatura ) );
                break;
            case 2:
                System.out.printf("%.2f grados en fahrenheit es: %.2f%n", 
                        temperatura, centrigradosAFahrenheit( temperatura ) );
                break;
            default:
                    JOptionPane.showMessageDialog(null, "Entrada invalida");
                    break;
        }
    }
    
    public static double fahrenheitACentrigrados( double temperatura )
    {
        return 5.0 / 9.0 * (temperatura - 32);
    }
    
    public static double centrigradosAFahrenheit( double temperatura )
    {
        return 9.0 / 5.0 * temperatura + 32;
    }
}
