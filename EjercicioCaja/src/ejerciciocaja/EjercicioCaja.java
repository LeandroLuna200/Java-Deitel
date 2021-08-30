/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocaja;

/**
 *
 * @author Leandro
 */
public class EjercicioCaja {
    private double ancho,
                   alto,
                   profundidad;
    static int contadorCajas;
    private int idCaja;
    
    public EjercicioCaja()
    {
        this.idCaja= ++contadorCajas;
    }
    
    public EjercicioCaja(double ancho, double alto, double profundidad)
    {
        this();
        this.alto= alto;
        this.ancho= ancho;
        this.profundidad= profundidad;
    }
    
    public double Volumen()
    {
        return this.alto*this.ancho+this.profundidad;
    }
    public double Volumen(double ancho, double alto, double profundidad)
    {
        return this.alto*this.ancho+this.profundidad;
    }
    
    public void Mostrar()
    {
        System.out.println("ID: "+ this.idCaja +" (Alto: " + this.alto + "), (Ancho: "+ this.ancho+ 
                            "), Prof: "+ this.profundidad + ")");
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public int getIdCaja() {
        return idCaja;
    }
    
    @Override
    public String toString()
    {
        return "ID: "+ this.idCaja +" (Alto: " + this.alto + "), (Ancho: "+ this.ancho+ 
                            "), Prof: "+ this.profundidad + ")";
    }
}
