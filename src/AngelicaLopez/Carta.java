
package AngelicaLopez;

public class Carta {
    //varibales que contienen las 2 opciones de las cartas
    private final String cara;
    private final String palo;

    //se inicializan las variables con contructor
    public Carta(String cara, String palo) {
        this.cara = cara;
        this.palo = palo;
    }
    
    //se devuelve el objeto carta como un string
    public String toString(){
        return cara + " de " + palo;
    }
}
