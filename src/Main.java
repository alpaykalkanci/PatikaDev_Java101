import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Değişkenleri oluştur
        int matematik, fizik, kimya, turkce, tarih, muzik , toplam;
        double notOrtalamasi = 0;

        //Kullanıcıdan değerleri al
        System.out.print("Öğrencinin Matematik notunu giriniz: ");
        matematik = input.nextInt();

        System.out.print("Öğrencinin Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Öğrencinin Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Öğrencinin Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Öğrencinin Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Öğrencinin Müzik notunu giriniz: ");
        muzik = input.nextInt();

        toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        notOrtalamasi = (double) toplam / 6 ;
        System.out.println("Öğrencinin Not Ortalaması: " + notOrtalamasi);

        boolean gecti = notOrtalamasi > 60;
        boolean kaldi = notOrtalamasi < 60;


        String ogrDurumu = (notOrtalamasi > 60) ? "Öğrenci Sınıfı Geçti!" : "Öğrenci Sınıfta Kaldı!" ;
        System.out.print(ogrDurumu);

    }
}