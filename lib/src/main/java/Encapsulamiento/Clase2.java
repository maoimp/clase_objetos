package Encapsulamiento;

public class Clase2 {

    public static void main(String[] args) {
// Encapsular los valores de atributos y metodos


        Clase1 ob1 = new Clase1();
       ob1.setEdad(15);

       // Si hago esto nos va a dar un error porque esta encapsulado
       // ob1.edad = 40;

        System.out.println("La edad es :"+ob1.getedad());

        ob1.setNombre("Alejandra");
        System.out.println("El nombre es "+ob1.getNombre());

    }
}
