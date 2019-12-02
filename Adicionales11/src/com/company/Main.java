package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca número 1: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca número 2: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca número 3: ");
        n3 = sc.nextInt();
        System.out.println("Máximo: " + maximo(n1,n2,n3));
        System.out.println("Medio: " + medio(n1,n2,n3));
        System.out.println("Mínimo: " + minimo(n1,n2,n3));
    }
    private static int maximo(int a, int b, int c)
    {
        int max = a;
        if(b > a && b > c)
        {
            max = b;
        }
        if(c > a && c > b)
        {
            max = c;
        }
        return max;
    }
    private static int medio(int a, int b, int c)
    {
        int med = a;
        if((b > a && b < c) || (b > c && b < a))
        {
            med = b;
        }
        if((c > a && c < b) || (c > b && c < a))
        {
            med = c;
        }
        return med;
    }
    private static int minimo(int a, int b, int c)
    {
        int min = a;
        if(b < a && b < c)
        {
            min = b;
        }
        if(c < a && c < b)
        {
            min = c;
        }
        return min;
    }
}
