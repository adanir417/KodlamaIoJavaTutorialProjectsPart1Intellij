package stringilecalismak;

public class StringDemoMain {
    public static void main(String[] args)
    {
        String mesaj = "Bugün hava çok güzel.";

        /*
        System.out.println(mesaj);
        System.out.println("5.eleman : " +mesaj.charAt(4));
        System.out.println(mesaj.toLowerCase());//bütün hepsini küçük harflerle yazdırır.
        System.out.println(mesaj.length()); // Eleman sayısını verir. boşluklar da birer eleman sayılır.
        System.out.println(mesaj.toUpperCase());// bütük hepsini büyük harflerle yazdırır.
        System.out.println(mesaj.concat(" Yaşasın!")); // iki string'i birleştirir. Eğer bu değer daha sonra kullanılacaksa başka bir String değişkenine atılmalı.
        System.out.println(mesaj.startsWith("B"));// B ile başlıyorsa true dönecektir. startswith ne ile başladığını kontrol eder.
        System.out.println(mesaj.endsWith(".")); // endsWith ne ile bittiğini kontrol eder. İçerik doğruysa true döner.
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);//int srcBegin kaynak başlangıcı, srcEnd kaynak bitişi, atanacak char array  , -- dst destination begin- hedefin başlangıcı.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); // soldan başlayarak ilk bulduğu karakterin index'ini döner.
        System.out.println(mesaj.lastIndexOf('e')); // soldan başlayarak son bulduğu karakterin index'ini döner.
        */


        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(6,9));

        System.out.println("-----------------------------------------------");
        //Kelime kelime ayırmak
        for(String kelime: mesaj.split(" "))
        {
            System.out.println(kelime);
        }
        //veri tabanına arama ifadesi gönderildiğinde kullanılır.
        // genelde hepsi küçük harfe çevrilip o şekilde aranır.
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String boslukluMesaj = "    Bugun hava çok güzel   ";
        System.out.println(boslukluMesaj);
        System.out.println(boslukluMesaj.trim());





    }
}
