package conditionals;

public class ConditionalsMain {
    public static void main(String[] args){

        //int sayi = 20; // Bu tanımda if şartına uymadığı için if bloğuna girmedi.
        //int sayi = 19; // Bu tanımlamada iflerden sadece üstteki çalışır.
        int sayi = 14; // Bu tanımlamada iki if ifadesi de çalışır.
        if(sayi < 20)
        {
            System.out.println("Sayı yirmiden küçüktür.");
        }

        if(sayi < 15)
        {
            System.out.println("Sayı onbeşten küçüktür.");
        }

        System.out.println("------------------------------------------------");

        int sayi1 = 22; // Burada ilk if bloğu çalışmadığı halde else bloğuna geçer ve koşulsuz çalıştırır.
        if(sayi1 < 20 )
        {
            System.out.println("Sayı yirmiden küçüktür.");
        }
        else
        {
            System.out.println("Sayı yirmiden küçük değildir.");
        }

        System.out.println("------------------------------------------------");

        int sayi2 = 31;
        if(sayi2 < 20 )
        {
            System.out.println("Sayı yirmiden küçüktür.");
        }
        else if(sayi2 <30)
        {
            System.out.println("Sayı otuzdan küçüktür.");
        }
        else if(sayi2 < 32) // Çalışması gereken blok
        {
            System.out.println("Sayı otuzikiden küçüktür."); // Console mesajı
        }
        else
        {
            System.out.println("Sayı yukarıdaki hiç bir ifadeye uymadı.");
        }

        System.out.println("------------------------------------------------");
        int sayi3 = 60;

        if(sayi3 == 60)
        {
            System.out.println("Sayi3 altmışa eşittir.");
        }

        // defensive programing. -- Veri kaçağı durumlarına önlem almak için tüm şartlara önlem alarak programlamaktır.


        /*
        // Karşılaştırma ifadelerine operatörler(Operators) deniyor.
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html

        postfix	expr++ expr--
        unary	++expr --expr +expr -expr ~ !
        multiplicative	* - / - %    // çarpma - bölme - kalanını alma
        additive	+ - // toplama çıkarma
        shift	<< >> >>>
        relational	< > <= >= instanceof // küçüktür büyüktür küçükeşittir büyükeşittir // instanceof - nesnenin belirtilen türden (sınıf veya alt sınıf veya arayüz) bir örnek olup olmadığını test etmek için kullanılır.
        // https://www.javatpoint.com/downcasting-with-instanceof-operator
        equality	== != // eşittir ==    // Eşit değildir !=
        bitwise AND	&
        bitwise exclusive OR	^
        bitwise inclusive OR	|
        logical AND	&& // Mantıksal sınama - VE operatörü - Bütün ifadeler true ise true döner. Eğer ifadelerden biri bile false olursa false döner.
        logical OR	|| // Mantıksal sınama - OR operatörü - İfadelerden birinin true olması yeterlidir. False dönmesi sadece bütün ifadeler false ise gerçekleşir.
        ternary	? :
        assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=


        */



    }
}
