/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg2.infoarchivosydirectorios;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class InfoArchivosYDirectorios {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escriba el nombre del archivo o direcorio:");
        
        // crear objeto Path con base en la entrada del usuario
        Path ruta = Paths.get(entrada.nextLine());
        
        if( Files.exists( ruta ) )
        {
            // mostrar información de archivo (o directorio)
            System.out.printf("%n%s existe%n", ruta.getFileName() );
            System.out.printf("%s un directorio%n",
                    Files.isDirectory(ruta) ? "Es" : "No es" );
            System.out.printf("%s una ruta absoluta%n",
                    ruta.isAbsolute()? "Es" : "No es" );
            System.out.printf("Fecha de ultima modificacion : %s%n",
                    Files.getLastModifiedTime(ruta) );
            System.out.printf("Tam: %s%n", Files.size(ruta));
            System.out.printf("Ruta: %s%n", ruta);
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath());
            
            if( Files.isDirectory(ruta) )
            {
                System.out.printf("%nContenido del directorio:%n");
                
                // objeto para iterar a través del contenido de un directorio
                DirectoryStream<Path> flujoDirectorio = 
                        Files.newDirectoryStream(ruta);
                
                for( Path p : flujoDirectorio )
                    System.out.println(p);
            }
            else // no es archivo o directorio, imprimir en pantalla mensaje de error
            {
                System.err.printf("%s no esxite%n", ruta);
            }
        } 
    }
}
