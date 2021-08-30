/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersona;

import java.time.LocalDate;

/**
 *
 * @author Leandro
 */
public class Persona {
 
    private String nombre;
    private int idPersona;
    private LocalDate fechaNac;
    private static int contadorPers;

    public Persona() 
    {    
        this.idPersona= ++contadorPers;
    }
    
    public Persona(Persona personaAnt)
    {
        this.idPersona= personaAnt.idPersona;
        this.nombre= personaAnt.nombre;
        this.fechaNac= personaAnt.fechaNac;
    }
    
    public Persona(String nombre, LocalDate fechaNac)
    {
        this();
        this.nombre= nombre;
        this.fechaNac= fechaNac;
    }
    
    public void Mostrar()
    {
        System.out.println("IdPersona: " + this.idPersona + ", Fecha Nacimiento: "
                            + this.fechaNac + ", Nombre: " + this.nombre);
    }
    
    @Override
    public String toString()
    {
        return "IdPersona: " + this.idPersona + ", Fecha Nacimiento: "
                            + this.fechaNac + ", Nombre: " + this.nombre;
    }
    
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Persona p= (Persona) obj;
        if(this.fechaNac.equals(p.fechaNac))
            return this.nombre.equals(p.nombre);
        return false;
    }
}
