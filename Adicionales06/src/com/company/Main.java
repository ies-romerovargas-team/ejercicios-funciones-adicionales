package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe número [3-20]: ");
        int n = sc.nextInt();
        rombo(n);
    }

    public static void rombo(int e) {
        int i;
        if (e < 3 || e > 20) {
            System.out.println("ERROR");
        } else {
            for (i = 1; i <= e; i++) {
                escribeEspacios(e - i);
                escribeAsteriscosPro(i);
            }
            for (i = e - 1; i >= 1; i--){
                escribeEspacios(e - i);
                escribeAsteriscosPro(i);
            }
        }
    }

    public static void escribeEspacios(int n){
        if (!(n == 0)) {
            System.out.print(" ");
            escribeEspacios(n - 1);
        }
    }
    public static void escribeAsteriscosPro(int n) {
        if (n == 0) {
            System.out.println();
        } else {
            System.out.print("**");
            escribeAsteriscosPro(n - 1);
        }
    }
}