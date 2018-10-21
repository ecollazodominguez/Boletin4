
package boletin4_3;


public class Boletin4_3 {


    public static void main(String[] args) {
        //Instancio objeto y muestro area y perimetro
        Circulo circulo1 = new Circulo();
        
        System.out.println("Area círculo es = "+circulo1.calcularArea());
        System.out.println("Perímetro es = "+circulo1.calcularLonxitude());
        //Instancio objeto envio radio y muestro area y perimetro
        Circulo circulo2 = new Circulo(25);
        
        System.out.println("Area círculo es = "+circulo2.calcularArea());
        System.out.println("Perímetro es = "+circulo2.calcularLonxitude());
    }
  
    
}
