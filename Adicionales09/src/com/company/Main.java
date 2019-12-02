package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bisiestosXXI();
    }
    public static void bisiestosXXI()
    {
        int i;
        for (i = 2001; i<=2100; i++)
        {
            if(bisiesto(i))
            {
                System.out.println(i);
            }
        }
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
}
