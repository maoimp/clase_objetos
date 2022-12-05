package com.example.lib;

import javax.sound.midi.Soundbank;

public class MyClass {

    public static void main (String[] args){

        Coche coche1 = new Coche();

        coche1.color = "Blanco";
        coche1.marca = "BMW";
        coche1.km = 0;


        System.out.println("EL color de coche 1 es :"+coche1.color);
        System.out.println("La marca dek coche 1 es :"+coche1.marca);
        System.out.println("El kilometraje del coche 1 es :"+coche1.km);


        Coche coche2=new Coche();

        coche2.color="Azul";
        coche2.marca="Audi";
        coche2.km=10;

        System.out.println("EL color de coche 1 es :"+coche2.color);
        System.out.println("La marca dek coche 1 es :"+coche2.marca);
        System.out.println("El kilometraje del coche 1 es :"+coche2.km);




    }



}