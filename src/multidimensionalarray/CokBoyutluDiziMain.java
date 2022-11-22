package multidimensionalarray;

public class CokBoyutluDiziMain {
    public static void main(String[] args)
    {

        String[][] sehirler = new String[3][3];
        // 3 sütun ve 3 satır elemandan oluşan bir dizi oluşturmuş olduk.

        // 3 * 3 = 9 eleman bulunuyor.

        sehirler[0][0] = "İstanbul"; //1
        sehirler[0][1] = "Bursa"; //2
        sehirler[0][2] = "Bilecik"; //3
        sehirler[1][0] = "Ankara"; //4
        sehirler[1][1] = "Konya"; //5
        sehirler[1][2] = "Kayseri"; //6
        sehirler[2][0] = "Diyarbakır"; //7
        sehirler[2][1] = "Şanlıurfa"; //8
        sehirler[2][2] = "Gaziantep"; //9

        //Nested loop - iç içe döngüler.
        for (int i = 0; i < sehirler.length ; i++) {
           System.out.println("----------------------------------------");
            for (int j = 0; j < sehirler[i].length ; j++) {
            System.out.println(sehirler[i][j]);
            }
            System.out.println("----------------------------------------");
            System.out.println();
            System.out.println();
        }

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------------------------------");
            for (int j = 0; j <=2 ; j++) {
                System.out.println(sehirler[i][j]);

            }

        }




    }
}
