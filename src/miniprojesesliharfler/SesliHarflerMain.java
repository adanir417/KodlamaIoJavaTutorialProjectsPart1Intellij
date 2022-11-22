package miniprojesesliharfler;

public class SesliHarflerMain {
    public static void main(String[] args)
    {
        /*

        Kalın sesli harfler (ünlüler); a, ı, o, u

        İnce sesli harfler (ünlüler); e, i, ö, ü

         (a, e, ı, i, o, ö, u, ü) Sesli harflerin tümü.

        */
        char harf = 'e';


        switch (harf)
        {
            case 'A' :
            case 'a' :
            case 'I' :
            case 'ı' :
            case 'O' :
            case 'o' :
            case 'U' :
            case 'u' :
                System.out.println("Kalın sesli harftir.");
                break;
            case 'E' :
            case 'e' :
            case 'İ' :
            case 'i' :
            case 'Ö' :
            case 'ö' :
            case 'Ü' :
            case 'ü' :
                System.out.println("İnce sesli harftir.");
                break;

            default : System.out.println("Bu harf, sessiz bir harftir.");
        }



    }
}
