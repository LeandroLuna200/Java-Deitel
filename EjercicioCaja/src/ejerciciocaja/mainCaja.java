/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocaja;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class mainCaja {

    public static void main(String[] args)
    {
        EjercicioCaja c1,
                      c2;
        Scanner entrada= new Scanner(System.in);
        
        c1= new EjercicioCaja();
        c2= new EjercicioCaja(1, 2, 3);
        
        c1.Mostrar();
        c2.Mostrar();
        
        System.out.println("Volumen c2: "+ c2.Volumen());
        System.out.print("Ingrese un nuevo alto: ");
        c2.setAlto(Double.parseDouble(entrada.nextLine()));
        c2.Mostrar();
        
        System.out.println(c2.toString());
        
//        LocalDate fecha= new LocalDate.now();
        Date fecha1= new Date(1,1,1);
        System.out.println(fecha);
        System.out.println(fecha1);
    }
}
