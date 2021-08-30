/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg10.creararchivosecuencial;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class CrearArchivoSecuencial {

    private static ObjectOutputStream salida;
    
    public static void main(String[] args) {
        abrirArchivo();
        agregarRegistros();
        cerrarArchivo();
    }
    
    public static void abrirArchivo()
    {
        try
        {
            salida = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("clientes.ser")));
        }
        catch(IOException ioException)
        {
            System.err.println("Error al abrir el archivo. Terminando");
            System.exit(1);
        }
    }
    
    public static void agregarRegistros()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n",
                "Escriba numero de cuenta, nombre, apellido y saldo",
                "Escriba el identificador de fin de archivo para terminar la entrada");
        
        while( entrada.hasNextInt() )
        {
            try
            {
                // crea nuevo registro; este ejemplo asume una entrada válida
                Cuenta registro = new Cuenta( entrada.nextInt(),
                    entrada.next(), entrada.next(), entrada.nextDouble());
                
                // serializa el objeto registro en el archivo
                salida.writeObject(registro);
            }
            catch(NoSuchElementException elementException)
            {
                System.err.println("Entrada invalida. Intente de nuevo");
                entrada.nextLine(); 
            // descarta la entrada para que el usuario pueda intentar de nuevo
            }
            catch( IOException ioException)
            {
                System.err.println("Error al abrir el archivo. Terminando");
                break;
            }
            
            System.out.print("? ");
        }
    }
    
    public static void cerrarArchivo()
    {
        try
        {
            if(salida != null)
                salida.close();
        }
        catch(IOException ioException)
        {
            System.err.println("Error al cerrar el archivo. Terminando.");
        }
    }
}
