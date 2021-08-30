/*
  Un jugador tira dos dados. Cada uno tiene seis caras, las cuales contienen 
uno, dos, tres cuatro, cinco y seis puntos negros, respectivamente. Una vez que
los dados dejan de moverse, se calcula la suma de los puntos negros en las dos 
caras superiores. Si la suma es 7 u 11 en el primer tiro, el jugador gana. 
Si la suma es 2, 3 o 12 en el primer tiro (llamado “Craps”), el jugador pierde 
(es decir, la “casa” gana). Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro,
esta suma se convierte en el “punto” del jugador. Para ganar, el jugador debe 
seguir tirando los dados hasta que salga otra vez “su punto” (es decir, que tire
ese mismo valor de punto). El jugador pierde si tira un 7 antes de llegar a su 
punto.
 */
package juego.de.probabilidad;

import java.security.SecureRandom;

/**
 * Juego "Craps"
 * @author Leandro
 */
public class JuegoDeProbabilidad {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    
    //estado del juego
    private enum Estado {CONTINUA, GANÓ, PERDIÓ};
    
    //constantes que representan tiros comunes del dado
    private static final int DOS_UNO = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;
    
    public static void main(String[] args) {
        int miPunto = 0; //punto si gano o pierdo en el primer tiro
        Estado estadoJuego;
        
        int sumaDeDados= tirarDados(); //primer tiro de lso dados
        
        switch( sumaDeDados )
        {
            case SIETE:
            case ONCE:
                estadoJuego = Estado.GANÓ;
                break;
            case DOS_UNO:
            case TRES:
            case DOCE: 
                estadoJuego = Estado.PERDIÓ;
                break;
            default: 
                estadoJuego= Estado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("El punto es %d%n", miPunto);
                break;
        }
        
        while( estadoJuego == Estado.CONTINUA)
        {
            sumaDeDados = tirarDados();
            
            if( sumaDeDados == miPunto )
                estadoJuego = Estado.GANÓ;
            else
                if( sumaDeDados == SIETE )
                    estadoJuego = Estado.PERDIÓ;
        }
        
        if( estadoJuego == Estado.GANÓ)
            System.out.println("El jugador gana");
        else
            System.out.println("El jugador pierde");
    }
    
    public static int tirarDados()
    {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);
        
        int suma = dado1 + dado2;
        
        System.out.printf("El juego tiro %d + %d = %d%n", dado1, dado2, suma);
        
        return suma;
    }
    
}
