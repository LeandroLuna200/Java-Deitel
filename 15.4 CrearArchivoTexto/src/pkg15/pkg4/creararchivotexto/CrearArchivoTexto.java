/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg4.creararchivotexto;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class CrearArchivoTexto {

    private static Formatter salida; // envía texto a un archivo
    
    public static void main(String[] args) {
        abrirArchivo();
        agregarRegistros();
        cerrarArchivo();
    }
    
    // abre el archivo clientes.txt
    public static void abrirArchivo()
    {
        try
        {
            salida = new Formatter("clientes.txt"); 
        }
        catch(SecurityException securityException )
        {
            System.err.println("permiso de escritura denegado. Terminado.");
            System.exit(1); //termina el programa
        }
        catch(FileNotFoundException fileNotFoundException )
        {
            System.err.println("Error al abrir el archivo. Terminado.");
            System.exit(1); //termina el programa
        }
    }
    
    // agrega registros al archivo
    public static void agregarRegistros()
    {
        Scanner entrada = new Scanner(System.in );
        
        System.out.printf("%s%n%s%n?",
                "Escriba numero de cuenta, nombre, apellido y saldo.",
                "Para terminar la entrada, "
                        + "escriba el indicador de fin de archivo");
        
        while (entrada.hasNextInt()) {   
            try
            {
            // escribe el nuevo registro en el archivo; asume una entrada válida
                salida.format("%d %s %s %.2f%n", entrada.nextInt(),
                    entrada.next(), entrada.next(), entrada.nextDouble() );
            }
            catch(FormatterClosedException formatterClosedException )
            {
                System.err.println(
                        "Error al escribir en el archivo. Terminando");
                break;
            }
            catch(NoSuchElementException elementException )
            {
                System.err.println(
                        "Error al escribir en el archivo. Terminando");
                break;//descarta la entrada para que el usuario intente de nuevo
            }
            System.err.print("? ");
        }
    }
    
    public static void cerrarArchivo()
    {
        if( salida != null )
            salida.close();
    }
}
