
package boletin4_2;


public class Boletin4_2 {


    public static void main(String[] args) {
        Satelite satelite1 = new Satelite();
        satelite1.verPosicion();
        
        Satelite satelite2 = new Satelite(25.5322512f, 5.55325f, 2.323523f);
        satelite2.verPosicion();
    }
    
}
