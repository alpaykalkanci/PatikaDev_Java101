import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scn.nextInt();

        int basamakSayisi =0 ,
                tempNumber = girilenSayi,
                basamakDegeri = tempNumber % 10,
                adimSayar = 1,
                sayininUssu,
                result = 0;

        while(tempNumber != 0) {
            tempNumber /= 10;
            basamakSayisi++;
        }

        System.out.println("Girilen sayının basamak sayısı: " + basamakSayisi + "\n");

        tempNumber = girilenSayi;

        while (tempNumber != 0){
            basamakDegeri = tempNumber % 10;
            sayininUssu = 1;
            System.out.println(adimSayar + ". adımda üssü alınacak sayı: " + basamakDegeri);

            for (int i = 1; i <= basamakSayisi; i++){

                sayininUssu *= basamakDegeri;

            }

            result += sayininUssu;

            System.out.println(adimSayar + ". adımda üssü alınan sayının üssünün alınmış hali: " +  sayininUssu + "\n");

            tempNumber /= 10;
            adimSayar++;
        }

        System.out.println("\nGirilen sayının üslerinin toplamı: " + result);


    }
}
