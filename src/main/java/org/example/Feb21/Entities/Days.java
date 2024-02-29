package org.example.Feb21.Entities;

import java.util.Scanner;

public class Days {
    public static void getDays(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        Integer dayNumber = day.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido");
                break;
        }
    }
}
