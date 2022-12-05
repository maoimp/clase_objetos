package Metodos;

import javax.swing.JOptionPane;

public class Metodo {
    public static void main(String[] args) {

        Operacion  op = new Operacion();
/*
        op.LeerNumeros();
        op.sumar();
        op.restar();
        op.multiplcar();
        op.dividir();
        op.mostrarResultados();
*/


        int opcion = 0;
        do{
            System.out.println("Menú ");
            System.out.println("1.Ingresar numeros ");
            System.out.println("2. Sumar ");
            System.out.println("3. Restar ");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
           // System.out.println("\n Digite la opcion  ");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite opcion"));
            switch (opcion){
                case 1:
                    op.LeerNumeros();
                    break;
                case 2:
                    op.sumar();

                    break;
                case 3:
                    op.multiplcar();
                    break;
                case 4:
                    op.dividir();
                case 5:
                    op.mostrarResultados();
            }
        } while ((opcion!=6));


    }
}
