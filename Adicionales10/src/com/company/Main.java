package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        escribeSerieNumeros3();
    }

    public static String escribeSerieNumeros3()
    {
        Scanner sc= new Scanner(System.in);
        int n1, n2, n3;
        do {
            System.out.print("Introduzca un número del 1 al 100: ");
            n1 = sc.nextInt();
            System.out.println();
        } while (n1 < 1 || n1 > 100);

        do {
            System.out.print("Introduzca un número del 1 al 100 que sea mayor que " + n1 + ": ");
            n2 = sc.nextInt();
            System.out.println();
        } while ((n2 < 1 || n2 > 100) || n2 < n1);

        do {
            System.out.print("Introduzca un número del 1 al 100 que sea mayor que " + n1 + " y menor que " + n2 +": ");
            n3 = sc.nextInt();
            System.out.println();
        } while ((n3 < 1 || n3 > 100) || n3 < n1 || n3 > n2);
        int i;
        for(i = n1; i <= n3; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = n3; i <= n2; i++)
        {
            System.out.print(i + " ");
        }
        return "";
    }
}
