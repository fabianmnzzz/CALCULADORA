/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabia
 */
public class Calculadora {
    
   private double n1;
   private double n2;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
   
    public double Sumar (){
        double suma=n1+n2;
        return suma;
    }
    public double Resta (){
        double resta=n1-n2;
        return resta;
    }
    public double Multiplicacion (){
        double multiplicacion=n1*n2;
        return multiplicacion;
    }
    public double Division (){
        if(n2==0){
            System.out.println("No se puede dividir entre 0");
        }
        double div=n1/n2;
        return div;
    }
}

