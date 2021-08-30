/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovariables;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class EjemploVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("HOLA MUNDO");
        System.out.println("sout+ tab");
        boolean bUno, bDos= false;
        
        bUno= true;
//        bDos= false;

        System.out.println("bUno= " + bUno + "\t bDos= " + bDos);
        
        byte byte1= 15;
        System.out.println("byte1 " + byte1);
        byte byte2= 0x2A;
        System.out.println("byte2 " + byte2);
        
        short short1= 10;
        System.out.println("short " + short1);
        
        char c1= 'c';
        char c2= 65;
        System.out.println("c1 " + c1);
        System.out.println("c2 " + c2);
        
        int entero= 1509;
        System.out.println("entero " + entero);
        
        long long1= 10L;
        System.out.println("long1 " + long1);
        
        float flotante= 10.8f;
        double doble1= 45.63;
        
        final int constant= 314;
        
        
        Scanner entrada= new Scanner(System.in);
//        System.out.println("Ingrese un entero: ");
//        int num= entrada.nextInt();
//        System.out.println("num: " + num);
//        System.out.println("Ingrese un entero: ");
//        int num2= entrada.nextInt();
//        System.out.println(num+num2); //si antes hay una cadena, concatena todo a cadena
        
        String cad1= "Hola, chau";
        System.out.println("msj: "+ cad1);
        
//        System.out.println("Ingrese una cadena: ");
//        String cad2= entrada.next(); //agarra hasta el espacio
//        System.out.println("Ingrese una cad: ");
//        String cad3= entrada.nextLine();
//        System.out.println(cad2+ cad3);
        
//        String cad4= entrada.nextLine();
        
//        int num6= Integer.parseInt(entrada.nextLine());
//        int num8= entrada.nextInt();
//        System.out.println("cad4: "+ num8);
        System.out.println("Ingrese una cadena: ");
        
        String cad7= entrada.nextLine();
        System.out.println(cad7);
        
        float float4= Float.parseFloat(cad7);
        System.out.println("flotante: " + float4);
    }

}
