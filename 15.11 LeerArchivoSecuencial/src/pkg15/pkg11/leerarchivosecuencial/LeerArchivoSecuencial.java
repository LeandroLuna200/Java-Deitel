/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg11.leerarchivosecuencial;

//import pkg15.pkg10.creararchivosecuencial.Cuenta;
import pkg15.pkg10.creararchivosecuencial.Cuenta;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author leand
 */
public class LeerArchivoSecuencial {

    private static ObjectInputStream entrada;
    
    public static void main(String[] args) {
        abrirArchivo();
        leerRegistros();
        cerrarArchivo();
    }
    
    public static void abrirArchivo()
    {
        try
        {
            entrada = new ObjectInputStream(
                Files.newInputStream(Paths.get("clientes.ser")));
        }
        catch(IOException ioException)
        {
            System.err.println("Error al abrir el archivo. Terminando");
            System.exit(1);
        }
    }
    
    public static void leerRegistros()
    {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Cuenta",
                "Nombre", "Apellido", "Saldo");
        
        try
        {
            while(true)
            {
                Cuenta registro;
                registro = (Cuenta) entrada.readObject();
                
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                        registro.obtenerCuenta(), registro.obtenerNombre(),
                        registro.obtenerApellido(), registro.obtenerSaldo());
            }
        }
        catch(EOFException endOfFileException)
        {
            System.out.println("No hay mas registros");
        }
        catch(ClassNotFoundException classNotFoundException)
        {
            System.err.println("Tipo de objeto invalido. Terminando.");
        }
        catch(IOException ioException)
        {
            System.err.println("Error al leer del archivo. Terminando.");
        }
    }
    
    public static void cerrarArchivo()
    {
        try
        {
            if(entrada != null)
                entrada.close();
        }
        catch(IOException ioException)
        {
            System.err.println("Error al abrir el archivo. Terminando");
            System.exit(1);
        }
    }
}
