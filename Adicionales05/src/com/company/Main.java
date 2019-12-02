package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe número [3-20]: ");
        int n = sc.nextInt();
        trianguloEstrellitas(n);
    }

    public static void trianguloEstrellitas(int e) {
        int i;
        if (e < 3 || e > 20)
        {
            System.out.println("ERROR");
        } else {
            for (i = 1; i <= e; i++) {
                escribeAsteriscos(i);
            }
        }
    }

    public static void escribeAsteriscos(int n) {
        if (n == 0) {
            System.out.println();
        }
        else
        {
            System.out.print("*");
            escribeAsteriscos(n - 1);
        }
    }
}
