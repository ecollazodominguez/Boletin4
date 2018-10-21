
package boletin4_3;

public class Circulo {
    //atributos
    private double radio;
    private double PI= 3.14;
    //constructores
    public Circulo(){
        
    }
    public Circulo(float radio){
        this.radio= radio;
    }    
    //metodos
    public double calcularArea(){
        double radio2;
        radio2= Math.pow(radio, 2);
        return radio2*PI;
    }
    public double calcularLonxitude(){
        return 2*PI*radio;
    }
    
}
