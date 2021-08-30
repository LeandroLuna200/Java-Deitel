/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersona;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        Persona p= new Persona();
        System.out.println("p: " + p.toString());
        
        Persona p1= new Persona(p);
        p1.Mostrar();
        
        LocalDate fHoy= LocalDate.of(2019, Month.JANUARY, 19);
        System.out.print("Ingrese un nombre: ");
        
        Persona p2= new Persona(entrada.nextLine(), fHoy);
        p2.Mostrar();
        
        Persona p3= new Persona(p2);
        
        if( p2.equals(p3))
            System.out.println("Son iguales");
        else
            System.out.println("Son distintos");
    }
    
}
