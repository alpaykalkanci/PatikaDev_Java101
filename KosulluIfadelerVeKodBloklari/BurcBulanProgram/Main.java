import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /* BURÇ BULAN PROGRAM
        Burç bulan program
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        */

        Scanner sc = new Scanner(System.in);
        int day, month;
        String koc = "KOÇ", 
        boga = "BOĞA",
        ikizler = "İKİZLER",
        yengec = "YENGEÇ",
        aslan = "ASLAN",
        basak = "BAŞAK",
        terazi = "TERAZİ",
        akrep = "AKREP",
        yay = "YAY",
        oglak = "OĞLAK",
        kova = "KOVA",
        balik = "BALIK";

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = sc.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        day = sc.nextInt();

        

        if (month == 1) {
            if ((day >= 1) && (day <= 21)) {
                System.out.println("Burcunuz: " + oglak);
            }else if ((day >= 22) && (day <= 31)){
                System.out.println("Burcunuz: " + kova);
            } else {
                System.out.println("Ocak ayı en fazla 31 gün çeker.");
            }
        }

        if (month == 2) {
            if ((day >= 1) && (day <= 19)) {
                System.out.println("Burcunuz: " + kova);
            }else if ((day >= 20) && (day <= 29)){
                System.out.println("Burcunuz: " + balik);
            } else {
                System.out.println("Şubat ayı en fazla 29 gün çeker.");
            }
        }

        if (month == 3) {
            if ((day >= 1) && (day <= 20)) {
                System.out.println("Burcunuz: " + balik);
            }else if ((day >= 21) && (day <= 31)){
                System.out.println("Burcunuz: " + koc);
            } else {
                System.out.println("Mart ayı en fazla 31 gün çeker.");
            }
        }

        if (month == 4) {
            if ((day >= 1) && (day <= 20)) {
                System.out.println("Burcunuz: " + koc);
            }else if ((day >= 21) && (day <= 30)){
                System.out.println("Burcunuz: " + boga);
            } else {
                System.out.println("Nisan ayı en fazla 30 gün çeker.");
            }
        }

        if (month == 5) {
            if ((day >= 1) && (day <= 21)) {
                System.out.println("Burcunuz: " + boga);
            }else if ((day >= 22) && (day <= 31)){
                System.out.println("Burcunuz: " + ikizler);
            } else {
                System.out.println("Mayıs ayı en fazla 31 gün çeker.");
            }
        }

        if (month == 6) {
            if ((day >= 1) && (day <= 22)) {
                System.out.println("Burcunuz: " + ikizler);
            }else if ((day >= 23) && (day <= 30)){
                System.out.println("Burcunuz: " + yengec);
            } else {
                System.out.println("Haziran ayı en fazla 30 gün çeker.");
            }
        }

        if (month == 7) {
            if ((day >= 1) && (day <= 22)) {
                System.out.println("Burcunuz: " + yengec);
            }else if ((day >= 23) && (day <= 31)){
                System.out.println("Burcunuz: " + aslan);
            } else {
                System.out.println("Temmuz ayı en fazla 31 gün çeker.");
            }
        }

        if (month == 8) {
            if ((day >= 1) && (day <= 22)) {
                System.out.println("Burcunuz: " + aslan);
            }else if ((day >= 23) && (day <= 31)){
                System.out.println("Burcunuz: " + basak);
            } else {
                System.out.println("Ağustos ayı en fazla 31 gün çeker.");
            }
        }

        if (month == 9) {
            if ((day >= 1) && (day <= 22)) {
                System.out.println("Burcunuz: " + basak);
            }else if ((day >= 23) && (day <= 31)){
                System.out.println("Burcunuz: " + terazi);
            } else {
                System.out.println("Eylül ayı en fazla 30 gün çeker.");
            }
        }

        if (month == 10) {
            if ((day >= 1) && (day <= 22)) {
                System.out.println("Burcunuz: " + terazi);
            }else if ((day >= 23) && (day <= 31)){
                System.out.println("Burcunuz: " + akrep);
            } else {
                System.out.println("Ekim ayı en fazla 31 gün çeker.");
            }
        }

        if (month == 11) {
            if ((day >= 1) && (day <= 21)) {
                System.out.println("Burcunuz: " + akrep);
            }else if ((day >= 22) && (day <= 30)){
                System.out.println("Burcunuz: " + yay);
            } else {
                System.out.println("Kasım ayı en fazla 30 gün çeker.");
            }
        }

        if (month == 12) {
            if ((day >= 1) && (day <= 21)) {
                System.out.println("Burcunuz: " + yay);
            }else if ((day >= 22) && (day <= 31)){
                System.out.println("Burcunuz: " + oglak);
            } else {
                System.out.println("Aralık ayı en fazla 31 gün çeker.");
            }
        }
    }
}
