package miniprojearkadassayilar;

public class ArkadasSayilarMain {

    public static void main(String[] args) {
        //220-284
        // kendileri hariç pozitif tam bölenleri birbirine eşit olan sayılara arkadaş sayılar denir.

        int sayi1 = 284;
        int sayi2 = 220;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if ((sayi1 % i) == 0) {
                toplam1 += i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if ((sayi2 % i) == 0) {
                toplam2 += i;
            }

        }

        if ((sayi1 == toplam2) && (toplam1 == sayi2)) {
            System.out.println("Bu sayılar arkadaş sayıdır : " + sayi1 + " " + sayi2);
        }


        int sayi001 = 0;
        int sayi002 = 0;
        int toplam001 = 0;
        int toplam002 = 0;
        int maxValue001 = 10_000;
        boolean arkadasMi = false;

        for (int i = 1; i < maxValue001; i++) {
            for (int j = 1; j < i; j++) {
                if ((i % j) == 0) {
                    toplam001 += j; // birinci sayının tam bölenlerinin toplamı.
                }
                for (int k = 1; k < j; k++) {
                    if ((j % k) == 0) {
                        toplam002 += k; // ikinci sayının tam bölenlerinin toplamı.
                    }
                }
                if (toplam002 == i) {
                    if (toplam001 == j) {
                        System.out.println("Bu sayılar arkadaştır. " + i + " " + j);

                    }
                }

                toplam002 = 0;

            }
            toplam001 = 0;

        }


    }
}
