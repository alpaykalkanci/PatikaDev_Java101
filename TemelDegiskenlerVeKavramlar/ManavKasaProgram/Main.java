import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double armutFiyat = 2.14, armutKg, elmaFiyat = 3.67, elmaKg,
               domatesFiyat = 1.11, domatesKg, muzFiyat = 0.95, muzKg,
               patlicanFiyat = 5, patlicanKg ;
        double toplam = 0;

        System.out.println("Aldığınız ürünlerin kg olarak miktarını giriniz.");

        System.out.print("Armut miktarı (kg): ");
        armutKg = input.nextDouble();
        armutFiyat *= armutKg;
        System.out.println("Armut için: " + armutFiyat);

        System.out.print("Elma miktarı (kg): ");
        elmaKg = input.nextDouble();
        elmaFiyat *= elmaKg;
        System.out.println("Elma için: " + elmaFiyat);

        System.out.print("Domates miktarı (kg): ");
        domatesKg = input.nextDouble();
        domatesFiyat *= domatesKg;
        System.out.println("Domates için: " + domatesFiyat);

        System.out.print("Muz miktarı (kg): ");
        muzKg = input.nextDouble();
        muzFiyat *= muzKg;
        System.out.println("Muz için: " + muzFiyat);

        System.out.print("Patlıcan miktarı (kg): ");
        patlicanKg = input.nextDouble();
        patlicanFiyat *= patlicanKg;
        System.out.println("Patlıcan için: " + patlicanFiyat);

        toplam = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;

        System.out.println("Aldığınız ürünler için ödemeniz gereken miktar toplamı: " + toplam + " TL");

    }

}
