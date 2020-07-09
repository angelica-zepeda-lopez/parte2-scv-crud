
package AngelicaLopez;

public class PruebaCartas {
    public static void main(String[] args) {
        PaqueteDeCartas paquete = new PaqueteDeCartas();
        paquete.barajar();
        
        for (int i = 0; i <= 52; i++) {
            System.out.printf("%-25s", paquete.repartirCart());
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
