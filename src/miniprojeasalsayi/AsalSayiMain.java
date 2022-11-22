package miniprojeasalsayi;

import java.util.ArrayList;

public class AsalSayiMain {
    public static void main(String[] args)
    {
        int number = 17;
        int reminder = number % 2;
       // System.out.println(reminder);
        boolean isPrime = true;

        // return; ifadesi bulunulan bloğu bitirmeye yarıyor.

        if(number == 1)
        {
            System.out.println("Sayı asal değildir.");
            return;
        }

        if(number < 1)
        {
            System.out.println("Geçersiz sayı");
            return;
        }


        for(int i = 2; i < number ; i++)
        {
            if(number % i == 0)
            {
                isPrime = false;
            }
        }

        if (isPrime) // if (isPrime == true) ile aynı
        {
            System.out.println("Sayı asaldır.");
        }
        else
        {
            System.out.println("Sayı asal değildir.");
        }

        System.out.println("--------------------------------------------------------");

        int countDiveders =0;

        ArrayList<Integer> asalSayiListesi = new ArrayList<Integer>();


        for (int i = 1; i <= number; i++) {
            if((number % i) == 0)
            {
                countDiveders++;
            }

        }
        if(countDiveders > 2)
        {
            System.out.println(number + " - Sayı asal değildir.");
        }
        else
        {
            System.out.println(number + " - Sayı asaldır.");
        }

        System.out.println("--------------------------------------------------------");

        int countDiveders01 = 0;
        for (int i = 5; i <= 2000 ; i++) {
           // System.out.println(i);
            for (int j = 1; j <= i; j++) {
                //System.out.println(j);
                if ( (i % j) == 0 )
                {
                   // System.out.println(countDiveders01);
                    countDiveders01++;
                }
                else if( countDiveders01 ==3)
                {
                    break;
                }


            }
            //System.out.println(countDiveders01);

            if (countDiveders01 < 3)
            {
               // System.out.println(i);
                asalSayiListesi.add(i);
               // countDiveders01 = 0;
            }
            countDiveders01 = 0;
        }


        for (int asalSayi:asalSayiListesi) {
            System.out.println("Asal sayi : " +asalSayi);
        }


    }
}
