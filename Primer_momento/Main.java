package org.example;
import java.util.Scanner;
public class Main {
    //ejercicio 1
    public static boolean OrdenArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                return false;
            }
        }
        return true;
    }
    //ejercicio 2
    public static boolean ComparacionCadenas(String cadena1, String cadena2) {
        StringBuilder inversa = new StringBuilder(cadena1).reverse();
        return inversa.toString().equals(cadena2);
    }
    //ejercicio 3
    public static boolean Contraseña(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean caracterEspecial = false;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            } else if (Character.isLowerCase(c)) {
                minuscula = true;
            } else if (Character.isDigit(c)) {
                numero = true;
            } else if ("!@#$%^&*".indexOf(c) != -1) {
                caracterEspecial = true;
            }
        }

        return mayuscula && minuscula && numero && caracterEspecial;
    }
    //ejercicio 4
    public static void CadenaVocales(String cadena) {
        int vocales = 0;
        int consonantes = 0;
        String letras = cadena.toLowerCase();

        for (char c : letras.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    public static void main(String[] args) {
        // Ejercicio 1
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Ejercicio 1: " + OrdenArreglo(numeros));

        // Ejercicio 2
        System.out.println("Ejercicio 2: " + ComparacionCadenas("hola", "aloh"));

        // Ejercicio 3
        System.out.println("Ejercicio 3: " + Contraseña("Abc123!@"));

        // Ejercicio 4
        CadenaVocales("Hola Mundo");
    }
}