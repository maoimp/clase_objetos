package Herencia;

public class Persona {
   // Cambiamos a protected, los atributos de la clase persona ahora pueden ser
    // accedidos por los miembros de la clase y subclases
   /* protected String nombre;
    protected String apellido;*/
    private String nombre;
    private String apellido;
    private int edad;


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
