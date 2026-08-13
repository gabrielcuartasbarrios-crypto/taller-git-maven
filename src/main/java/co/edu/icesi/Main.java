package co.edu.icesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre + "!");

        System.out.println("Adiós, " + nombre + ". Nos vemos luego.");

    }
}