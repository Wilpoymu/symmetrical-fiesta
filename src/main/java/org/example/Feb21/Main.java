package org.example.Feb21;

import org.example.Feb21.Entities.Days;
import org.example.Feb21.Entities.IMC;
import org.example.Feb21.Entities.Temp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Si desea convertir temperatura, ingrese 1. \nSi desea calcular IMC, ingrese 2. \nSi desea saber el día de la semana, ingrese 3.");
        Integer calc = myObj.nextInt();

        if (calc == 1) {
            Temp.temp(args);
        } else if (calc == 2) {
            IMC.ImcCalc(args);
        } else if (calc == 3) {
            Days.getDays(args);
        } else {
            System.out.println("Opción no válida");
        }
    }
}
