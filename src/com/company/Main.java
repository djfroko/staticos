package com.company;

import com.company.ejemplo.ClaseEstatica;
import com.company.ejemplo.Test;

public class Main {

    public static void main(String[] args) {

        //Test test = new Test();
        //System.out.print(test.toString());

        int numero = 10;
        int numeroEntero = numero;
        numero = 20;

        String nombre = new String("Gustavo");
        String nombreCompleto = nombre;
        nombre = "Antonio";

        Test test1 = new Test(10);
        Test test2 = new Test(20);

        System.out.println(test1);
        System.out.println(test2);

        test1.setNumeroEntero(20);

        System.out.println(test1.getNumeroEntero());
        System.out.println(test2.getNumeroEntero());


        System.out.println(nombre + " " + nombreCompleto); // Gustavo Gustavo | Antonio Gustavo | Antonio Antonio

        System.out.println(numero + " " + numeroEntero); // 10 10 | 20 10 | 10 20

        //llamada a un metodo estatico de una clase. no requiere instancir el objeto para utilizarlo
        ClaseEstatica.nombreCompuesto("Gustavo", "Gamboa");


        //Creo un objeto y modifico el valor de su variable estatica
        ClaseEstatica estatica1 = new ClaseEstatica();
        estatica1.numeroEstatico = 10;

        //Genero un nuevo objeto
        ClaseEstatica estatica2 = new ClaseEstatica();

        ClaseEstatica estatica3 = new ClaseEstatica();

        //estatica3.numeroEstatico = 100;
        //pinto el valor de la variable estatica del nuevo objeto
        System.out.println(estatica1.numeroEstatico);
        System.out.println(estatica2.numeroEstatico);
        estatica1.numeroEstatico = 100;
        System.out.println(estatica3.numeroEstatico);
        System.out.println(estatica1.numeroEstatico);
        System.out.println(estatica2.numeroEstatico);

        System.out.println();

    }
}
