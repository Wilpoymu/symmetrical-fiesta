package org.example;

import org.example.Entities.IMC;
import org.example.Entities.Temp;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Si desea convertir temperatura, ingrese 1. \nSi desea calcular IMC, ingrese 2");
    Integer calc = myObj.nextInt();

    if (calc == 1) {
        Temp.temp(args);
    } else if (calc == 2) {
        IMC.ImcCalc(args);
    } else {
        System.out.println("Opción no válida");
    }
}
}
