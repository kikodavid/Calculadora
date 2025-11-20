/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.daw.programming;

import java.util.Scanner;

/**
 *
 * @author Alumnado
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        int suma = 0;

        System.out.println("Ingresa números enteros (0 para terminar):");

        while (numero != 0){
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                suma = suma +numero;
            }

        }

        System.out.println("La suma de los números positivos es: " + suma);
    }
//Comentario Calculadora.java
//comentario 2 para calculadora.java
//comentario ejercico 6
//rama2
}

