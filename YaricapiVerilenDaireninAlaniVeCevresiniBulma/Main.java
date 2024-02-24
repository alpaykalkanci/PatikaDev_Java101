import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        double r, alan, cevre;


        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Yarıçapı " + r + " olan dairenin alanı: " + alan);
        System.out.print("Yarıçapı " + r + " olan dairenin çevresi: " +  + cevre);

    }
}
