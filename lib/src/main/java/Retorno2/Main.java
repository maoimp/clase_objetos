package Retorno2;

import javax.swing.JOptionPane;

import Parametros.Retorno.Operacion;

public class Main {
    public static void main(String[] args) {

// Otra forma de imprimir los datos
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero 1 "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero 2"));

        Operacion op = new Operacion();

        //double suma =
        System.out.println("La suma es "+op.sumar(n1,n2));
        //double resta =
        System.out.println("la resta es"+op.restar(n1,n2));
        //double mult =
        System.out.println("La multiplicacion es "+op.multiplcar(n1,n2));
        //double div =
        System.out.println("La division es "+op.dividir(n1,n2));

        // Las variables que definimos
      //lo quitamos   op.mostrarResultados(suma,resta,mult,div);
    }

}
