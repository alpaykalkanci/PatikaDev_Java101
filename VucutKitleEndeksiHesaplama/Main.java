import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double kilo = 0, boy = 0;

        System.out.print("Kilonuzu giririniz(kg): ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz(cm): ");
        boy = input.nextDouble();
        boy = boy / 100;

        double kitleEndeksi = kilo / (boy * boy);


        System.out.println("Vücut kitle endeksiniz: " + kitleEndeksi);

        String sonuc = kitleEndeksi < 19 ? "Zayıfsınız" : "Çok şişmansınız" ;
        System.out.println(sonuc);

    }

}
