package org.example.Feb21.Entities;

import java.util.Scanner;

public class IMC {
    public static void ImcCalc(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg, por ejemplo 70");
        Double weight = myObj.nextDouble();
        System.out.println("Ingrese su altura en metros, por ejemplo 1,75");
        Double height = myObj.nextDouble();

        Double imc = weight / (height * height);
        System.out.println("Tu IMC es: " + imc);
    }
}
