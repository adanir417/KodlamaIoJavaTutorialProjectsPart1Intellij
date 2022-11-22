package datatypes;

public class DataTypes {
    public static void main(String[] args){
        // java tip güvenli bir dildir. Bir değişken tanımlandığında ne tipte olduğunu bilmek ister.

        /*
        *
        * byte	0  >> byte byteSayi = 0;
        * short	0  >> short shortSayi = 0;
        * int	0  >> int intSayi = 0;
        * long	0L >> long longSayi = 0L; // Long tanımlanırken sayı sonuna büyük harf ile 'L' eklenir.
        *
        *
        * float	0.0f   >> float floatSayi = 0f; // float tanımlanırken sayı sonuna küçük harf ile 'f' eklenir.
        * double 0.0d >> double doubleSayi = 0d; // Double tanımlanırken sayı sonuna küçük harf ile 'd' eklenir.
        *
        *
        * char	'\u0000' >> char a = 'a'; // Karakterler tanımlanırken tek tırnak kullanılır.
        * String (or any object)  null >> String cumle = "Uzunca bir cümle";
        * boolean	false >> boolean faturaOdendiMi = true; // Bu değer doğru ve yanlışı sorgulamak için kullanılır.
        *
        *
        * */

        byte byteSayi = 0;
        short shortSayi = 0;
        int intSayi = 0;
        long longSayi = 0L;

        float floatSayi = 0f;
        double doubleSayi = 0d;


        char a = 'a';
        char karakter = 'K';
        String cumle = "Uzunca bir cümle";
        boolean faturaOdendiMi = true;

        System.out.println("ByteSayi : " + byteSayi);
        System.out.println("ShortSayi : " + shortSayi);
        System.out.println("IntSayi : " + intSayi);
        System.out.println("LongSayi : " + longSayi);
        System.out.println("FloatSayi : " + floatSayi);
        System.out.println("DoubleSayi : " + doubleSayi);
        System.out.println("Char a : " + a);
        System.out.println("Char karakter : " + karakter);
        System.out.println("String : " + cumle);
        System.out.println("Boolean : " + faturaOdendiMi );

        // Geliştiriciler genelde int ve double kullanır.
        // TC Kimlik numarası gibi sayıların üzerinde matematiksel işlem yapılmadığı için
        // metinsel tutulması gereklidir.


    }

}
