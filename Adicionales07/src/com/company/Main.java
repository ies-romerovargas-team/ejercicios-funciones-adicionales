package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        for (i = 1; i < 13; i++)
        {
            System.out.println();
            calendarioGrafico(i,2019);
            System.out.println();
        }
    }

    public static void calendarioGrafico(int mes, int anno)
    {
        // Escribe mes y año
        System.out.println(mes + "/" + anno);
        // Escribe iniciales día semana
        System.out.println(" L  M  M  J  V  S  D");
        // Escribe días
        int i = 1, j = 1, k;
        k = diaSemanaFecha(1, mes, anno); // Primer día del mes
        while(j <= diasMes2(mes, anno)) {
            while(j < k)
            {
                System.out.print("   ");
                k--;
                i++;
            }
            if(j < 10)
            {
                System.out.print(" ");
            }
            System.out.print(j + " ");
            j++;
            i++;
            if (i == 8)
            {
                i = 1;
                System.out.println();
            }
        }
    }

    public static int diasTranscurridos(int dia, int mes, int anno)
    {
        int dias = 0, i;
        for(i = 1; i < mes; i++)
        {
            dias = dias + diasMes2(i, anno);
        }
        dias = dias + dia;
        return dias;
    }

    public static int diasTranscurridos1980(int dia, int mes, int anno)
    {
        int dias = 0, i;
        for (i = 1980; i < anno; i++)
        {
            if(bisiesto(i))
            {
                dias = dias + 366;
            }
            else
            {
                dias = dias + 365;
            }
        }
        // ultimo año
        dias = dias + diasTranscurridos(dia, mes, anno);
        return dias;
    }

    public static int diasEntreFechas(int d1, int m1, int a1, int d2, int m2, int a2)
    {
        int diasTotal1, diasTotal2, diferencia;
        diasTotal1 = diasTranscurridos1980(d1, m1, a1);
        diasTotal2 = diasTranscurridos1980(d2, m2, a2);
        diferencia = diasTotal2 - diasTotal1;
        return diferencia;
    }

    public static int diaSemanaFecha(int d, int m, int a)
    {
        int def = diasTranscurridos1980(d,m,a);
        return (def % 7) + 1;
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
}
