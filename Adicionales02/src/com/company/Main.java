package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// centigradosAFahrenheit y fahrenheitACentigrados
        Scanner sc = new Scanner(System.in);
        double t;
        System.out.print("Introduzca grados centígrados: ");
        t = sc.nextDouble();
        System.out.println(centigradosAFahrenheit(t) + " \u00b0F");
        System.out.println();
        System.out.print("Introduzca grados fahrenheit: ");
        t = sc.nextDouble();
        System.out.println(fahrenheitACentigrados(t) + " \u00b0C");
    }

    public static double centigradosAFahrenheit (double c)
    {
        return 1.8 * c + 32;
    }

    public static double fahrenheitACentigrados(double f)
    {
        return (f - 32) / 1.8;
    }
}