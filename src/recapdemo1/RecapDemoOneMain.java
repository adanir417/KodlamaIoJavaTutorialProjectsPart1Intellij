package recapdemo1;

public class RecapDemoOneMain {
    public static void main(String[] args)
    {
        System.out.println("Recap Demo 01");
        //Elimizdeki üç sayıdan en büyüğünü bulmak.

        int sayi1 = 10;
        int sayi2 = 15;
        int sayi3 = 20;
        int enBuyuk = 0;
        int enBuyukTest2 = 0;

        if(sayi1 <sayi2)
        {
         enBuyuk = sayi2;
        }
        else
        {
            enBuyuk = sayi1;
        }

        if(enBuyuk < sayi3)
        {
            enBuyuk = sayi3;
        }


        System.out.println("Alttaki sayılar arasından ");
        System.out.println(sayi1 + " " + sayi2 + " " + sayi3);

        System.out.println("En büyük sayı : " + enBuyuk);


        System.out.println("--------------------------------------");

        // Engin DEMİROĞ yaklaşımı
        int sayi01 = 266;
        int sayi02 = 25;
        int sayi03 = 26;
        int enBuyuk00 = sayi01;

        if(enBuyuk00 < sayi02)
        {
            enBuyuk00 = sayi02;
        }

        if(enBuyuk00 < sayi03 )
        {
            enBuyuk00 = sayi03;
        }

        System.out.println("Alttaki sayılar arasından ");
        System.out.println(sayi01 + " " + sayi02 + " " + sayi03);

        System.out.println("En büyük sayı : " + enBuyuk00);




        // karsilastir();

    }

    public static void karsilastir()
    {
        int a = 10;
        int b = 20;

        // as 10 less than 20, Output will be a value less than zero
        System.out.println(Integer.compare(a, b)); // Eğer a değeri b'den ufak ise -1 değeri dönüyor.

        int x = 30;
        int y = 30;

        // as 30 equals 30, Output will be zero
        System.out.println(Integer.compare(x, y)); // değerler birbirine eşit ise 0 değeri dönüyor.

        int w = 15;
        int z = 8;

        // as 15 is greater than 8, Output will be a value greater than zero
        System.out.println(Integer.compare(w, z)); // eğer w değeri z değerinden büyük ise 1 değeri dönüyor.
    }



}
