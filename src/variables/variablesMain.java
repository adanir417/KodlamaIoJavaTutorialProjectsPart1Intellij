package variables;

public class variablesMain {
    public static void main(String[] args){


        System.out.println("Variables - Değişkenler");

        // Değişkenler bir değer tutan kutucuklar gibidir.
        // bir kere oluşturup istenilen yerde kullanılabilir.

        int depoToplamUrun = 500;

        System.out.println("Depo toplam ürün sayısı : " + depoToplamUrun); // Bu yazımı daha da kısaltmak mümkün.

        String depoToplamUrunSayisi = "Depo toplam ürün sayısı : ";

        System.out.println(depoToplamUrunSayisi + depoToplamUrun); //Burada görüldüğü üzere artık değişken adı ile çağrı yapmak yeterlidir.

        // Java case sensitive - Büyük küçük harf duyarlı bir dildir. Samsun ile samsun aynı değildir.

        // değişkenler tanımlanırken camelCasing kullanılır- Deve hörgücüne benzediğinden bu şekilde nitelendirilir.
        // spiderMan, superMan, batMan gibi...

        //reusability -- tekrar kullanılabilirlik kavramı.
        // Bir kere yaz, Onu her yerde kullan - Aynı şeyi tekrar tekrar yazma.

        int ogrenciSayisi = 12;
        String mesaj = "Öğrenci sayisi : ";

        System.out.println(mesaj+ ogrenciSayisi);
        System.out.println(mesaj+ ogrenciSayisi);
        System.out.println(mesaj+ ogrenciSayisi);
        System.out.println(mesaj+ ogrenciSayisi);
        System.out.println(mesaj+ ogrenciSayisi);
        System.out.println(mesaj+ ogrenciSayisi);


    }


}
