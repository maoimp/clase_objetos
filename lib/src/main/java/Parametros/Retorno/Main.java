package Parametros.Retorno;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero 1 "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero 2"));

        Operacion op = new Operacion();

       double suma1 = op.sumar(n1,n2);
       double resta1 =  op.restar(n1,n2);
       double mult1 = op.multiplcar(n1,n2);
       double div1 =  op.dividir(n1,n2);

       // Las variables que definimos
       op.mostrarResultados(suma1,resta1,mult1,div1);

    }
}
