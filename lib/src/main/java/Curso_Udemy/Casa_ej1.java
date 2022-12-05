package Curso_Udemy;

public class Casa_ej1 {

    private String calle;
    private char seccion;
    private short numero;
    private int precio;



    public Casa_ej1(String calle, char seccion, short numero, int precio, long fecha_const,
                    float impuesto, double metros_cubicos, boolean hipotecada) {
        this.calle = calle;
        this.seccion = seccion;
        this.numero = numero;
        this.precio = precio;

    }

    public Casa_ej1(String regional, String d, String s, String s1) {
    }

    @Override
    public String toString() {
        return "Casa_ej1{" +
                "calle='" + calle + '\'' +
                ", seccion=" + seccion +
                ", numero=" + numero +
                ", precio=" + precio +
                '}';
    }
}
