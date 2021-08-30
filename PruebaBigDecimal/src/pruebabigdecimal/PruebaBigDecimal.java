/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabigdecimal;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Format;
import java.text.NumberFormat;

/**
 *
 * @author leand
 */
public class PruebaBigDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables BigDecimal inicializadas con valueOf que recibe un double
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal tasa      = BigDecimal.valueOf(0.05);
        
        System.out.printf("%s%20s%n", "Anio", "Monto de deposito");
        
        for(int anio = 1; anio <= 10; ++anio)
        {
            BigDecimal monto= principal.multiply( tasa.add(BigDecimal.ONE).pow(anio));
            
            System.out.printf("%4d%20s%n", 
                    anio, NumberFormat.getCurrencyInstance().format(monto));
            
            System.out.println(monto.setScale(0, RoundingMode.HALF_EVEN));

        }
    }
    
}
