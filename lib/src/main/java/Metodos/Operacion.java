package Metodos;

import javax.swing.JOptionPane;

public class Operacion {

    double numero1;
    double numero2;
    double suma;
    double resta;
    double multiplicacion;
    double division;

    // Metodos
    public void LeerNumeros(){

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite 1 "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite 2"));
       }
    public void sumar(){
        suma = numero1+numero2;
        System.out.println("La suma es "+suma);

    }
    public void restar(){
        resta = numero1-numero2;

    }
    public void multiplcar(){
        multiplicacion = numero1*numero2;
    }
    public void dividir(){

         if (numero2 == 0 ){
             numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero2 no puede ser 0 digite  numero 2"));
          }
        division = numero1/numero2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es :\t"+suma);
        System.out.println("La resta es :\t"+resta);
        System.out.println("La mul es :\t"+multiplicacion);
        System.out.println("La division es : \t"+division);



    }

}
