import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double minimumTutar = 20;
        double acilisUcreti = 10;
        double kmBasina = 2.20;
        double km,toplamTutar;

        System.out.print("Gideceğiniz KM'yi giriniz: ");
        km = input.nextDouble();

        toplamTutar = (km * kmBasina) + acilisUcreti;

        System.out.println("Minimum tutar olmadan ödeyeceğiniz ücret: " + toplamTutar);

        toplamTutar = toplamTutar < minimumTutar ? toplamTutar = 20 : toplamTutar;

        System.out.print("Minimum tutara göre ödeyeceğiniz toplam ücret: " + toplamTutar + " TL");



    }
}
