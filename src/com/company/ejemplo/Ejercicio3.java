package com.company.ejemplo;

/*Vamos a realizar un ejercicio en el que, dada una determinada cadena de caracteres, se
        inserte una barra / adicional entre palabras.
        Mediante el método indexOf() se irán buscando las posiciones donde se encuentran los espacios
        para insertar el espacio adicional, operación esta que será́realizada a través del método insert().*/


public class Ejercicio3 {

    public static void main(String[] args) {

        //con String

        String cadena = "esto es una cadena de caracteres";

        cadena = cadena.replace(" ", "/ ");

        System.out.println(cadena);


    }


}
