import jdk.jshell.Snippet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double r, a, alan, pi = 3.14;

        System.out.println("Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulmak için" +
                " aşağıdaki bilgilerini giriniz.");

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Dairenin merkez ölçüsünü giriniz: ");
        a = input.nextDouble();

        alan = (pi * (r*r) * a) / 360;

        System.out.printf("Yarıçapı "+ r + " merkez açısının ölçüsü "+ a + " olan daire diliminin alanı: "
        + alan);


    }

}
