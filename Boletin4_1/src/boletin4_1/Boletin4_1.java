
package boletin4_1;

public class Boletin4_1 {


    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.acelerar(20);
        
        System.out.println("Velocidade = "+coche1.getVelocidade());
        
        coche1.frenar(10);
        
        System.out.println("Velocidade = "+coche1.getVelocidade());
    }
    
}
