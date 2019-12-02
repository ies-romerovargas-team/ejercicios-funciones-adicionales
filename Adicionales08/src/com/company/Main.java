package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca valor [1-20]: ");
        int a = sc.nextInt();
        cuadradoEstrellitas(a);
    }

    public static String cuadradoEstrellitas(int n)
    {
        int i;
        if(n > 20 || n < 1)
        {
            return "ERROR";
        }
        else
        {
            lineaCompleta(n);
            System.out.println();
            if(n >= 3)
            {
                for (i = 2; i <= n-1; i++)
                {
                    lineaCentral(n);
                }
            }
            if(n >= 2) {
                lineaCompleta(n);
                System.out.println();
            }
        }
        return "";
    }

    public static void lineaCompleta(int l)
    {
        if(l!=0)
        {
            System.out.print("*");
            lineaCompleta(l - 1);
        }
    }

    public static void lineaCentral(int l)
    {
        int i = 1;
        System.out.print("*");
        while(i <= (l-2))
        {
            System.out.print(" ");
            i++;
        }
        System.out.print("*");
        System.out.println();
    }
}