package Encapsulamiento;

public class Clase1 {
    // Si los ponemos privados solo van a ser accedidos desde metodos de la misma clase 1
    private int edad;
    private String nombre;
// Si quiero acceder a estos atributos debo crear los metodos accesores


    // Set establecer . Establecer un valor para mi atributo

    public void setEdad(int edad){
        this.edad=edad;
    }
    // MOstrar un valor metodo getter
    public int getedad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
