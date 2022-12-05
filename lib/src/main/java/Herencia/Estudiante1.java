package Herencia;

public class Estudiante1 extends Persona {

    private int cod_etudiante;
    private float notaFinal;

    // Constructor
    public Estudiante1 (String nombre,String apellido, int edad,int cod_etudiante, float notaFinal){
        super(nombre,apellido,edad);
        this.cod_etudiante = cod_etudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("nombre"+getNombre()+"Apellido "+getApellido()+"edad"+getEdad());
        System.out.println("Estudiante nota final"+notaFinal);
        System.out.println("cod estudiante  "+cod_etudiante);
    }

}
