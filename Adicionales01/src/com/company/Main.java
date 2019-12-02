package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Primos relativos
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Introduzca n1: ");
        a = sc.nextInt();
        System.out.print("Introduzca n2: ");
        b = sc.nextInt();
        if(primosRelativos(a,b))
        {
            System.out.println("Son primos entre sí");
        }
        else
        {
            System.out.println("No son primos entre sí");
        }
    }

    public static boolean primosRelativos(int n1, int n2)
    {
        // divisores comunes
        // Comprobamos desde max(a, b) hasta 1 todos los divisores comunes hasta dar con el mayor. Si no existe ninguno el bucle acabará cuando i = 1, luego son primos entre sí
        int max, i;
        boolean primos;
        if (n1 > n2)
        {
            max = n1;
        }
        else
        {
            max = n2;
        }
        i = max - 1;

        while (!(n1 % i == 0 && n2 % i == 0))
        {
            i--;
        }

        if (i == 1)
        {
            primos = true;
        }
        else
        {
            primos = false;
        }
        return primos;
    }
}