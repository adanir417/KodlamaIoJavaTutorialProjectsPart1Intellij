package miniprojesayibulma;

public class SayiBulmaMain {
    public static void main(String[] args)
    {
        int[] sayilar = new int[]{1,2,5,7,9,0};

        int aranacak = 5;

        boolean sayiVarMi = false;

        boolean varMi = false;

        int index = 0;

        for (int sayi :
                sayilar) {
            if (aranacak == sayi)
            {
                sayiVarMi = true;

            }
        }

        for (int i = 0; i < sayilar.length; i++) {
            if(aranacak == sayilar[i])
            {
                index = i;
            }
        }

        if(sayiVarMi)
        {
            System.out.println("Aranan sayı bulundu.");
            System.out.println("Aranan \"" + aranacak + "\" sayı bulundu. " + " index : " + index + " indexde bulunan değer :  " + sayilar[index]);
        }

        for (int sayi : sayilar ) {
            if(aranacak == sayi)
            {
                varMi = true;
                break; // burada break bulununca döngüyü dururur.
            }

        }

        if(varMi) //varMi == true demek ile aynı şey olduğu için true kısmını yazmıyoruz.
         {
             System.out.println("Sayı mevcuttur.");

        }else
        {
            System.out.println("Sayı mevcut değildir.");
        }





    }

}
