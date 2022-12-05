package Retorno2;

public class Operacion {

    public double sumar(double numero1, double numero2){
        double  suma = numero1 +numero2;
        return suma;
    }
    public double restar(double numero1, double numero2){
        double resta = numero1 -numero2;
        return resta;
    }
    public double multiplcar(double numero1, double numero2){
        double  multiplicacion = numero1*numero2;
        return multiplicacion;
    }
    public double dividir(double numero1, double numero2){
        double division = numero1/numero2;
        return division;
    }
/* Quitamos el metodo
    public void mostrarResultados(double suma, double resta, double multiplicacion, double division){
        System.out.println("La suma es :\t"+suma);
        System.out.println("La resta es :\t"+resta);
        System.out.println("La mul es :\t"+multiplicacion);
        System.out.println("La division es : \t"+division);

    }  */
}
