import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double mat, fizik, turkce, kimya, tarih, advantage;

        do {
            System.out.print("Matematik notunu giriniz: ");
            mat = scanner.nextDouble();

            if (mat < 0 || mat > 100) {
                System.out.println("0'dan küçük ve 100'den büyük sayı giremezsiniz. Tekrar deneyin!");
            }

        } while (mat < 0 || mat > 100); // Koşul bu olduğu sürece "do" içerisindeki işlemleri yap

        do {
            System.out.print("Fizik notunu giriniz: ");
            fizik = scanner.nextDouble();

            if (fizik < 0 || fizik > 100) {
                System.out.println("0'dan küçük ve 100'den büyük sayı giremezsiniz. Tekrar deneyin!");
            }

        } while (fizik < 0 || fizik > 100);

        do {
            System.out.print("Türkçe notunu giriniz: ");
            turkce = scanner.nextDouble();

            if (turkce < 0 || turkce > 100) {
                System.out.println("0'dan küçük ve 100'den büyük sayı giremezsiniz. Tekrar deneyin!");
            }

        } while (turkce < 0 || turkce > 100);

        do {
            System.out.print("Kimya notunu giriniz: ");
            kimya = scanner.nextDouble();

            if (kimya < 0 || kimya > 100) {
                System.out.println("0'dan küçük ve 100'den büyük sayı giremezsiniz. Tekrar deneyin!");

            }

        } while (kimya < 0 || kimya > 100);
        
        
        do {
            System.out.print("Tarih notunu giriniz: ");
            tarih = scanner.nextDouble();

            if (tarih < 0 || tarih > 100) {
                System.out.println("0'dan küçük ve 100'den büyük sayı giremezsiniz. Tekrar deneyin!");

            }
        } while (tarih < 0 || tarih > 100);    


        advantage = (mat + fizik + turkce + kimya + tarih) / 5;
        System.out.println("Ortalamanız: " + advantage);

        if (advantage >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz!");
        } else {
            System.out.println("Maalesef Sınıfta Kaldınız :(");
        }



    }
}
