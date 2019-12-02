package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Funcion calderilla
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca dinero (<5€): ");
        double dinero = sc.nextDouble();
        calderilla(dinero);
        System.out.println();
        calderilla2(dinero);
    }

    private static void calderilla(double m)
    {
        int cent;
        int m2 = 0, m1 = 0, m050 = 0, m020 = 0, m010 = 0, m005 = 0, m002 = 0, m001 = 0;
        m = m * 100;
        cent = (int) m;
        // Monedas de 2 €
        if (cent >= 200)
        {
            while (cent >= 200)
            {
                m2++;
                cent = cent - 200;
            }
        }

        // Monedas de 1€
        if (cent >= 100)
        {
            while (cent >= 100) {
                m1++;
                cent = cent - 100;
            }
        }

        // Monedas de 0,5€
        if (cent >= 50)
        {
            while (cent >= 50) {
                m050++;
                cent = cent - 50;
            }
        }

        // Monedas de 0,2€
        if (cent >= 20)
        {
            while (cent >= 20) {
                m020++;
                cent = cent - 20;
            }
        }

        // Monedas de 0,1€
        if (cent >= 10)
        {
            while (cent >= 10) {
                m010++;
                cent = cent - 10;
            }
        }

        // Monedas de 0,05€
        if (cent >= 5)
        {
            while (cent >= 5) {
                m005++;
                cent = cent - 5;
            }
        }

        // Monedas de 0,02€
        if (cent >= 2)
        {
            while (cent >= 2) {
                m002++;
                cent = cent - 2;
            }
        }

        // Monedas de 0,01€
        if (cent >= 1)
        {
            while (cent >= 1) {
                m001++;
                cent--;
            }
        }

        // Salida por pantalla
        if (m2 > 0)
        {
            System.out.println(m2 + " monedas de 2€");
        }
        if (m1 > 0)
        {
            System.out.println(m1 + " monedas de 1€");
        }
        if (m050 > 0)
        {
            System.out.println(m050 + " monedas de 0,50€");
        }
        if (m020 > 0)
        {
            System.out.println(m020 + " monedas de 0,20€");
        }
        if (m010 > 0)
        {
            System.out.println(m010 + " monedas de 0,10€");
        }
        if (m005 > 0)
        {
            System.out.println(m005 + " monedas de 0,05€");
        }
        if (m002 > 0)
        {
            System.out.println(m002 + " monedas de 0,02€");
        }
        if (m001 > 0)
        {
            System.out.println(m001 + " monedas de 0,01€");
        }
    }

    public static void calderilla2(double m)
    {
        int centimos, monedas;
        centimos = (int) Math.round(m * 100);

        monedas = centimos / 200;
        System.out.println(monedas + " de 2€");
        centimos = centimos % 200;

        monedas = centimos / 100;
        System.out.println(monedas + " de 1€");
        centimos = centimos % 100;

        monedas = centimos / 50;
        System.out.println(monedas + " de 0,5€");
        centimos = centimos % 50;

        monedas = centimos / 20;
        System.out.println(monedas + " de 0,2€");
        centimos = centimos % 20;

        monedas = centimos / 10;
        System.out.println(monedas + " de 0,1€");
        centimos = centimos % 10;

        monedas = centimos / 5;
        System.out.println(monedas + " de 0,05€");
        centimos = centimos % 5;

        monedas = centimos / 2;
        System.out.println(monedas + " de 0,02€");
        centimos = centimos % 2;

        System.out.println(centimos + " de 0,01€");

    }
}