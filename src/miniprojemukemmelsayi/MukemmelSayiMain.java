package miniprojemukemmelsayi;

public class MukemmelSayiMain {
    public static void main(String[] args)
    {
        // mükemmel sayı = kendinden başka bütün pozitif tam bölenlerin toplamı sayının kendisine eşittir.

        long toplamTest = 0;
        //long maxValueNumber = 100_000_000_000_000L;
        long maxValueNumber = 10_000L;

        for (long i = 1; i < maxValueNumber; i++) {
            for (long j = 1; j < i; j++) {
                if(i % j == 0 )
                {
                    //toplamTest = toplamTest +j;
                    toplamTest += j;
                }
                
            }
            if(toplamTest == i)
            {
                System.out.println(i  + " " + "bir mükemmel sayıdır.");
            }
            toplamTest = 0;
            
        }
        
        
    }
}
