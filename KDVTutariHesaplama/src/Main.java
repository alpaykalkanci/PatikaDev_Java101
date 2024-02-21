import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        /* NOT:
           Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
           tutar 1000 TL'den büyük ise KDV oranını %8 alarak KDV tutarı hesaplayan programı yazınız.
        */

        //Değişkenleri tanımlama
        double tutar, kdvliTutar,kdvTutari;
        double kdvOrani = 0.18;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz fiyatı giriniz: ");

        //Alınan verileri işlemlere tabi tutma
        tutar = input.nextDouble();
        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;



        //İşlemlerin sonucuna göre ekrana sonuç yazdırma
        System.out.println("\nKDV'siz fiyat: " + tutar + " TL");
        System.out.println("KDV Oranı: %" + (kdvOrani*100));
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV dahil tutar: " + kdvliTutar + " TL");


    }

}