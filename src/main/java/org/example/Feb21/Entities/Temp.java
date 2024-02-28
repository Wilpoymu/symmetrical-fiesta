package org.example.Feb21.Entities;

import java.util.Scanner;

public class Temp {
    public static void temp(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Si desea convertir de Celsius a Fahrenheit, ingrese 1 \nSi desea convertir de Fahrenheit a Celsius, ingrese 2");
        Integer tempType = myObj.nextInt();
        String tempTypeString = tempType != 1 ? "Celsius" : "Fahrenheit";
        Double temperature;
        Double result = 0.0;

        if (tempType == 1) {
            System.out.println("Ingrese la temperatura en Celsius");
            temperature = myObj.nextDouble();
            result = temperature * 1.8 + 32.0;
        } else if (tempType == 2) {
            System.out.println("Ingrese la temperatura en Fahrenheit");
            temperature = myObj.nextDouble();
            result = (temperature - 32.0) / 1.8;
        }
        System.out.println("La temperatura es " + result + " grados " + tempTypeString);

    }
}
