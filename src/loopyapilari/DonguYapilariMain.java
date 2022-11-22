package loopyapilari;

public class DonguYapilariMain {
    public static void main(String[] args)
    {
        System.out.println("Döngü yapıları.");

        //For Döngüsü - En çok tercih edilen döngü.
        // i++ >> i = i + 1;
        for (int i = 1; i <= 10 ; i++)
        {
                System.out.println(i);
        }

        System.out.println("Fon döngüsü sonrası devam ediyor.");

        System.out.println("----------------------------");

        for (int i = 1; i <= 10 ; i+= 2) // Tek sayılar
        {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        for (int i = 2; i <= 10 ; i+= 2) // Çift sayılar // i = i+2
        {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        //----------------------------------------------------
        // While döngüsü
        // While döngüsünde infinite (sonsuz) döngüye girmemesi için
        // while bloğu içinde artış belirtilir. Veya herhangi bir çıkış kurgulanır.
        int i = 1;

        while(i < 10)
        {
           System.out.println(i);
           i++;
        }

        System.out.println("While döngüsü bitti.");
        System.out.println("----------------------------");
        int i2 = 1;

        do
        {   i2++;
            System.out.println(i2);

        }while(i2 < 10);
        System.out.println("Do-While döngüsü bitti.");

    }
}
