package Contructores;

public class Estudiante {

    // Atributos

    String nombre;
    String apellido;
    double promedio;
    int edad;

    // Metodo constructor, metodo especial que tiene el mismo nombre de la clase
    public Estudiante(String _nombre,String _apellido,double _promedio,int _edad){
        nombre = _nombre;
        apellido = _apellido;
        promedio = _promedio;
        edad = _edad;
    }

    public void mostrarDatos (){
        System.out.println("El nombre es "+nombre);
        System.out.println("El apellido es :"+apellido);
        System.out.println("El promedio es :"+promedio);
        System.out.println("La edad es :"+edad);
    }
}
