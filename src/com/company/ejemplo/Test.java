package com.company.ejemplo;

public class Test {

    private int numeroEntero; //0 | null
    private double numeroReal; //0.0 | null
    private boolean esCierto; //false
    private char caracter; //'' | null |  
    private String nombre; //null | ""
    private Object test; //null

    /**
     * Constructor que inicializa un numero entero
     * @param entero Entero que vamos a utilizar para setear el valor de la variable
     */
    public Test(int entero){
        numeroEntero = entero;
    }

    /**
     * Metodo que recupera el valor de la variable numeroEntero
     * @return
     */
    public int getNumeroEntero() {
        return numeroEntero;
    }

    /**
     * Metodo que nos permite setear el valor a la variable de la clase numeroEntero
     * @param numeroEntero
     */
    public void setNumeroEntero(int numeroEntero) {
        this.numeroEntero = numeroEntero;
    }
/*
    @Override
    public String toString() {
        return "Test{" +
                "numeroEntero=" + numeroEntero +
                ", numeroReal=" + numeroReal +
                ", esCierto=" + esCierto +
                ", caracter=" + caracter +
                ", nombre='" + nombre + '\'' +
                '}';
    }*/
}
