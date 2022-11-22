package arrayyapilari;

public class DizilerMain {
    public static void main(String[] args)
    {
        System.out.println("Diziler");

        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------------------------------");
        // ogrenciler eklendikçe isim yazdırmak sıkıntıya sokacak.
        // indexler 0 ile başlar.
        String[] ogrenciler = new String[5];
        ogrenciler[0] = "Engin"; //1
        ogrenciler[1] = "Derin"; //2
        ogrenciler[2] = "Salih"; //3
        ogrenciler[3] = "Ahmet"; //4
        ogrenciler[4] = "Mustafa"; //5

        for(int i = 0; i < ogrenciler.length ; i++)
        {
            System.out.println(i+1 + "." + ogrenciler[i]);
        }

        System.out.println("-------------------------------------------");

        System.out.println(ogrenciler.length);
        for (String ogrenci: ogrenciler) {
            System.out.println(ogrenci);

        }
        System.out.println("-------------------------------------------");

    }
}
