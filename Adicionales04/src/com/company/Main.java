package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número para calcular n\u00B2: ");
        int n = sc.nextInt();
        System.out.println(n + "\u00B2 = " + potencia2(n));
    }

    public static int potencia2(int a)
    {
        if (a<0) return -1;
        return a * a;
    }
}
