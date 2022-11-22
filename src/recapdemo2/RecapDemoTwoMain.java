package recapdemo2;

public class RecapDemoTwoMain {

    public static void main(String[] args) {
        System.out.println("RecapDemo2");

        double[] myList = new double[20];
        double[] myList0 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] myList2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        double total = 0;
        // Diziler içindeki en büyük sayıyı bulmak için şu yöntem izlenir.
        double max = 0.0;

        for (double sayilar : myList0) {
            if (max < sayilar) {
                max = sayilar;
            }
            total = total + sayilar;
            System.out.println(sayilar);
        }
        System.out.println("Toplam myList : " + total);

        System.out.println("En büyük sayı : " + max);

        System.out.println("-----------------------------------------------");
        total = 0;
        max = 0;
        for (double sayilar : myList2) {
            if (max < sayilar) {
                max = sayilar;
            }
            total = total + sayilar;
            System.out.println(sayilar);
        }
        System.out.println("Toplam myList2 : " + total);

        System.out.println("En büyük sayı : " + max);

        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");


    }
}
