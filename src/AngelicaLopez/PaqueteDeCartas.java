
package AngelicaLopez;

import java.security.SecureRandom;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PaqueteDeCartas {
    private Carta[] paquete;//arreglo de objetos carta
    private int cartaActual;
    private static final int NUMERO_DE_CARTAS = 52;//numero de cartas es una constante
    
    //generar numeros aleatorios con la clase SecureRandom
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    
    public PaqueteDeCartas(){
        String[] caras = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho",
                            "Nueve", "Diez", "Joker", "Reina", "Rey"};
        String[] palos = { "Corazones", "Diamantes", "Treboles", "Espadas"};
        
        
        paquete = new Carta[NUMERO_DE_CARTAS];
        cartaActual = 0;
        
        for (int i = 0; i < paquete.length; i++) {
            paquete[i] = new Carta(caras[i % 13], palos[i / 13]);
        }
    }
    
    //metodo para mezclar las cartas
    public void barajar(){
        cartaActual = 0;
        
        for (int primera = 0; primera < paquete.length; primera++) {
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }
    
    //metodo para repartir cartas
    public Carta repartirCart(){
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++];
        } else {
            return null;
        }
    }
}
