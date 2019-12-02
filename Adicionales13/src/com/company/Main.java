package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// calculaNotaFinal
        double n1, n2, n3, n4, n5, n6, n7;
        n1 = pedirNotaValida(1);
        n2 = pedirNotaValida(2);
        n3 = pedirNotaValida(3);
        n4 = pedirNotaValida(4);
        n5 = pedirNotaValida(5);
        n6 = pedirNotaValida(6);
        n7 = pedirNotaValida(7);
        int suspensos = NumeroSuspensos(n1, n2, n3, n4, n5, n6, n7);
        double media = (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7;
        if (suspensos>=2){
            media = 4;
        }
        media = media * 100;
        media = Math.floor(media);
        media = media / 100;
        System.out.println("Nota Media: "+ media);
    }

    public static int NumeroSuspensos(double s1, double s2, double s3, double s4, double s5, double s6, double s7 )
    {
        int s = 0;
        if (s1 < 5){
            s++;
        }
        if (s2 < 5){
            s++;
        }
        if (s3 < 5){
            s++;
        }
        if (s4 < 5){
            s++;
        }
        if (s5 < 5){
            s++;
        }
        if (s6 < 5){
            s++;
        }
        if (s7 < 5){
            s++;
        }
        return s;
    }
    public static double pedirNotaValida(int orden)
    {
        Scanner sc = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Introduzca una nota válida [0-10] para examen " + orden +": ");
            nota = sc.nextDouble();
        } while (nota < 0 || nota > 10);
        return nota;
    }
}
