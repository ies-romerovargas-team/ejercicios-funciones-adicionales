package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Lista de cuadrados perfectos entre 2 y 100");
        listaCuadradosPerfectos(2, 100);
    }

    public static void listaCuadradosPerfectos(int min, int max)
    {
        int i;
        for (i = min; i<=max; i++)
        {
            if(cuadradoPerfecto(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean cuadradoPerfecto(int a)
    {
        double r2 = Math.sqrt(a);
        double entero = Math.floor(r2);
        if (r2*r2 == entero*entero) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
