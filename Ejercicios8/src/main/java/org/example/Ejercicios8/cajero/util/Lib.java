package org.example.Ejercicios8.cajero.util;

import java.util.Scanner;

public class Lib {
    public static Scanner scanner = new Scanner(System.in);

    public static void pausa() {
        System.out.println("Pulsa INTRO para continuar");
        scanner.nextLine();
    }
}
