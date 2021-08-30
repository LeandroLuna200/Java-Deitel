/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg6.leerarchivotexto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class LeerArchivoTexto {

    private static Scanner entrada;

    public static void main(String[] args) {
//        abrirArchivo();
//        leerRegistros();
        

        try {
            // read all bytes
            byte[] bytes = Files.readAllBytes(Paths.get("clientes.txt"));

            // convert bytes to string
            String content = new String(bytes);

            // print contents
            System.out.println(content);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        cerrarArchivo();
    }

    public static void abrirArchivo() {
        try {
            entrada = new Scanner(Paths.get("clientes.txt"));
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo. Terminando");
            System.exit(1);
        }
    }

    public static void leerRegistros() {
        System.out.printf("%-10s%-14s%-14s%-10s%n", "Cuenta",
                "Primer Nombre", "Apellido", "Sueldo");

        try {
            while (entrada.hasNext()) {
                System.out.printf("%-10d%-14s%-14s%.2f%n",
                        entrada.nextInt(), entrada.next(),
                        entrada.next(), entrada.nextDouble());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println(
                    "El archvo no esta bien formado. Terminando");
        } catch (IllegalStateException stateException) {
            System.err.println(
                    "Error al abrir archivo. Terminando");
        }
    }

    public static void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }
    }
}
