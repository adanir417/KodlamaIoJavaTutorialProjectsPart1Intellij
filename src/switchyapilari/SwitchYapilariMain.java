package switchyapilari;

public class SwitchYapilariMain {

    public static void main(String[] args) {

        System.out.println("Switch Yapıları ");

        char grade = 'A';
        // A en iyi not
        // F en kötü not - kalma notu

        switch (grade) {
            case 'A':
                System.out.println("En yüksek başarı notu ile geçtiniz.");
                break;
            case 'B':
                System.out.println("Yüksek başarı notu ile geçtiniz.");
                break;
            case 'C':
                System.out.println("Orta başarı notu ile geçtiniz.");
                break;
            case 'D':
                System.out.println("kötü başarı notu ile geçtiniz.");
                break;
            case 'F':
                System.out.println("Kaldınız!");
                break;
            default:
                System.out.println("Belirttiğiniz not harfi yanlıştır.");
                break;
        }

        // Kodu hızlıca düzenlemek için format code kullanılır
        // Intellij idea ctrl+alt+shift+L ile kodu düzenlemek mümkün veya
        // Code >> reformat file ya da reformat code ile bu işlem yapılabilir.

        // Eclipse için ctrl+shift+F
        // Source >> format seçeneği ile yapılabilir.

        // Eğer iki harf içinde aynı çıktıyı vermek istersek şu şekilde oluşturuyoruz.
        int sayi = 20;

        switch (sayi) {
            case 10:
            case 20:
                System.out.println("Burası hem 20 için hem 10 için çalışacak");
                break;
            case 30:
                System.out.println("Burası sadece 30 için çalışacak.");
                break;
            default:
                System.out.println("Burası default kısmı");
                break;
        }

    }

}
