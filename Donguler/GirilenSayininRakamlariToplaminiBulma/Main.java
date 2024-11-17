import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        int basamakSayisi = 0,
                basamakDegeri = 0,
                tempNumber = girilenSayi,
                result = 0,
                adimSayar = 1;

        while(tempNumber != 0) {
            tempNumber /= 10;
            basamakSayisi++;
        }

        System.out.println("Girilen sayının basamak sayısı: " + basamakSayisi);

        while (girilenSayi != 0){

            basamakDegeri = girilenSayi % 10;
            int yeniToplam = result + basamakDegeri;
            System.out.println(adimSayar + ". adımdaki toplam= " + basamakDegeri + " + " + result + " = " + yeniToplam);
            result = yeniToplam;
            girilenSayi /= 10;
            adimSayar++;
        }

        System.out.println("Girilen sayının basamakları toplamı: " + result);

    }
}
