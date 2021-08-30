/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg4.pkg1.pruebaempleadoporcomision;

/**
 *
 * @author LEANDRO
 */
public class PruebaEmpleado {

    
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[4];
        
        Fecha fecha1 = new Fecha(1,1,98);
        Fecha fecha2 = new Fecha(19,12,98);
        
        objetosPorPagar[0] = new Factura("01235", "asiento", 2, 3.56);
        objetosPorPagar[1] = new Factura("46789", "llanta", 4, 4443.56);
        objetosPorPagar[2] = new EmpleadoAsalariado("lean", "luna", "123122"
                , fecha1, 800);
        objetosPorPagar[3] = new EmpleadoAsalariado("aaa", "qwerty", "2", 
                fecha2, 12.9);
        
        System.out.println(
                       "Facturas y Empleados procesados en forma polimorfica:");
        
        for( PorPagar porPagarActual : objetosPorPagar )
        {
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    porPagarActual.toString(), //manera implicita posible
                    "pago vencido", porPagarActual.obtenerMontoPago());
            
        }
    }
    
    
//    public static void main(String[] args) {
//        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
//        "Leandro", "Luna", "11-111-111", 1000 );
//        EmpleadoPorHora empleadoPorHoras     = new EmpleadoPorHora(
//        "Leandro", "Luna", "48-698-712", 16.75, 40 );
//        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(
//        "Leandro", "Luna", "40-886-200", 10000, .06 );
//        EmpleadoBaseMasComision empleadoBaseMasComision = 
//                new EmpleadoBaseMasComision( "Leandro", "Luna", "40-886-200", 
//                        1000, .04, 300 );
//        
//        System.out.println(
//                "Empleados procesados por separado:");
//        
//        System.out.printf("%n%s%n%s: $%,.2f%n%n", 
//                empleadoAsalariado, "Ingresos",
//                empleadoAsalariado.ingresos());
//        System.out.printf("%s%n%s: $%,.2f%n%n", 
//                empleadoPorHoras, "Ingresos",
//                empleadoPorHoras.ingresos());
//        System.out.printf("%s%n%s: $%,.2f%n%n", 
//                empleadoPorComision, "Ingresos",
//                empleadoPorComision.ingresos());
//        System.out.printf("%s%n%s: $%,.2f%n%n", 
//                empleadoBaseMasComision, "Ingresos",
//                empleadoBaseMasComision.ingresos());
//        
//        // crea un arreglo Empleado de cuatro elementos
//        Empleado[] empleados = new Empleado[4];
//        
//        // inicializa el arreglo con objetos Empleado
//        empleados[0] = empleadoAsalariado;
//        empleados[1] = empleadoPorHoras;
//        empleados[2] = empleadoPorComision;
//        empleados[3] = empleadoBaseMasComision;
//        
//        System.out.println("Empleados procesados en forma polimorfica:%n%n");
//        
//        for( Empleado empleadoActual : empleados )
//        {
//            System.out.println(empleadoActual);
//            
//            // conversión descendente de la referencia de Empleado
//            // a una referencia de EmpleadoBaseMasComision
//            if( empleadoActual instanceof EmpleadoBaseMasComision )
//            {
//                EmpleadoBaseMasComision empleado = 
//                        (EmpleadoBaseMasComision) empleadoActual;
//                
//                empleado.establecerSalarioBase(
//                        1.1 * empleado.obtenerSalarioBase());
//                
//                System.out.printf("el nuevo salario base con 10%% es: $%,.2f%n",
//                    empleado.obtenerSalarioBase());
//            }
//            
//            System.out.printf("ingresos $%,.2f%n%n",  empleadoActual.ingresos());
//        }
//        
//        for( int j= 0; j < empleados.length; j++ )
//            System.out.printf("El empleado %d es un %s%n", j,
//                    empleados[j].getClass().getName());
//
//    }
}
