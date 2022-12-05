package Parametros;

import javax.swing.JOptionPane;

public class Operacion {
// Fuera de los metodos variables globales, dentro del metodo variable local
    //double numero1;
    //double numero2;
    double suma;
    double resta;
    double multiplicacion;
    double division;

    // Metodos

    public void sumar(double numero1, double numero2){
       suma = numero1 +numero2;

    }
    public void restar(double numero1, double numero2){
        resta = numero1 -numero2;

    }
    public void multiplcar(double numero1, double numero2){
multiplicacion = numero1*numero2;

    }
    public void dividir(double numero1, double numero2){
division = numero1/numero2;

    }

    public void mostrarResultados(){
        System.out.println("La suma es :\t"+suma);
        System.out.println("La resta es :\t"+resta);
        System.out.println("La mul es :\t"+multiplicacion);
        System.out.println("La division es : \t"+division);



    }


}
