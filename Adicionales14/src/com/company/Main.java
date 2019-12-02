package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int d, m, a;
        System.out.print("Introduzca día [1-31]: ");
        d = sc.nextInt();
        System.out.print("Introduzca mes [1-12]: ");
        m = sc.nextInt();
        System.out.print("Introduzca año: ");
        a = sc.nextInt();
        escribeFechaBonita(d, m, a);
    }

    public static void escribeFechaBonita(int dia, int mes, int anno)
    {
        boolean error = false;
        String mesLetra = mesEnTexto(mes);
        if (mesLetra=="ERROR"){
            error = true;
        } else
        {
            // Comprobar correción día
            if(!diaCorrecto(dia, mes, anno)){
                error = true;
            }
        }
        if(error)
        {
            System.out.println("Fecha no Válida");
        }
        else
        {
            System.out.println(dia + " de " + mesLetra + " de " + anno);
        }
    }

    public static boolean diaCorrecto(int dia, int mes, int anno)
    {
        // Número correcto de días
        if (dia<= diasMes2(mes,anno))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int diasMes2(int mes, int anno)
    {
        int devuelve;
        switch (mes)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            devuelve = 31;
            break;
            case 2:
                if (bisiesto(anno))
                {
                    devuelve = 29;
                }
                else
                {
                    devuelve = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
            devuelve = 30;
            break;
            default:
                devuelve = 0;
                break;
        }
        return devuelve;
    }

    public static boolean bisiesto(int anno)
    {
        // Año bisiesto es el divisible entre 4,
        // salvo que sea año secular -último de cada siglo,
        // terminado en «00»-, en cuyo caso también
        // ha de ser divisible entre 400.
        boolean devuelve = false;
        if(anno % 4 == 0)
        {
            // año secular
            if(anno % 100 == 0)
            {
                // divisible entre 400
                if(anno % 400 == 0)
                {
                    devuelve = true;
                }
            }
            else
            {
                devuelve = true;
            }
        }
        return devuelve;
    }

    public static String mesEnTexto(int mes)
    {
        String devuelve;
        switch (mes)
        {
            case 1: devuelve = "enero"; break;
            case 2: devuelve = "febrero"; break;
            case 3: devuelve = "marzo"; break;
            case 4: devuelve = "abril"; break;
            case 5: devuelve = "mayo"; break;
            case 6: devuelve = "junio"; break;
            case 7: devuelve = "julio"; break;
            case 8: devuelve = "agosto"; break;
            case 9: devuelve = "septiembre"; break;
            case 10: devuelve = "octubre"; break;
            case 11: devuelve = "novimebre"; break;
            case 12: devuelve = "diciembre"; break;
            default: devuelve ="ERROR";
        }
        return devuelve;
    }
}
