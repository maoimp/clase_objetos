package Parametros;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
// Argumentos son para la invocacion de los metodos
        //y los parametros son para la declaracion de los metodos
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero 1 "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero 2"));

        Operacion op = new Operacion();

       op.sumar(n1,n2);
       op.restar(n1,n2);
       op.multiplcar(n1,n2);
       op.dividir(n1,n2);

       op.mostrarResultados();
    }
}
