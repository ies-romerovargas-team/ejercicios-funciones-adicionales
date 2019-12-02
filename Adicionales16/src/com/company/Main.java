package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número a descomponer: ");
        int a = sc.nextInt();
        descomponerFactoresPrimos(a);
    }

    public static void descomponerFactoresPrimos(int a)
    {
        System.out.print(a + " = ");
        int pr = 2;
        int i = 1;
        while (pr <= a)
        {
            int factor = a;
            while (factor % pr == 0)
            {
                factor = factor / pr;
                System.out.print(pr);
                i = i * pr;
                if (i != a)
                {
                    System.out.print(" x ");
                }
                if(a % pr != 0)
                {
                    pr = siguientePrimo(pr);
                    // No hace falta saber sí es primo o no, ya que la sucesión de factores elimina la posibilidad de dividir por números que son multiplos de los ya procesados
                }
            }
            pr = siguientePrimo(pr);
        }
    }

    public static int siguientePrimo(int n)
    {
        n++;
        while (!primo(n)) {
            n++;
        }
        return n;
    }

    public static boolean primo(int a)
    {
        int i;
        boolean devuelve;
        devuelve = true;
        for(i = a - 1; i > 1; i--)
        {
            if(a % i == 0){
                devuelve = false;
            }
        }
        return devuelve;
    }
}