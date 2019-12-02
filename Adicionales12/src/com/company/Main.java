package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura del romboide: ");
        int altura = sc.nextInt();
        System.out.print("Introduzca longitud del romboide: ");
        int longitud = sc.nextInt();
        romboide(altura,longitud);
    }

    public static void romboide(int a, int l)
    {
        int i;
        for (i = 1; i <= a; i++)    // Nº de filas
        {
            EscribirEspacios(a - i);
            EscribirAsteriscos(l);
            System.out.println();
        }
    }

    public static void EscribirEspacios(int n)
    {
        if(n!=0)
        {
            System.out.print(" ");
            EscribirEspacios(n-1);
        }
    }

    public static void EscribirAsteriscos(int n)
    {
        if(n!=0)
        {
            System.out.print("*");
            EscribirAsteriscos(n-1);
        }
    }
}
