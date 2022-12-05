package Constructores2;

public class Estudiante {
    // Atributos Sobrecarga de metodos

    String nombre;
    int edad;
    String dni;

    public Estudiante(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;

    }
// Cuando tenemos mas de un constructor se le llama sobrecarga de metodos
    // Los metodos se pueden sobrecargar siempre y cuando los parametros sean diferentes
    public Estudiante(String dni) {
        this.dni = dni;

    }
// Si cambiamos el tipo de parametro se puede utilizar
    // Prueba con retorno public int (){retorno 0}

    public void estudiar(){
        System.out.println("El estudiante :"+nombre+"y esta estudiande");

    }
    public void n_materias(int n_mat){
        System.out.println("El estudiante ha pasado "+n_mat);

    }


}
