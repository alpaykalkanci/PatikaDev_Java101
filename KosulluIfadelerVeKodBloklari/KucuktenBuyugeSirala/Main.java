import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        /* Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız. */

        Scanner sc = new Scanner(System.in);

        int sayi1, sayi2, sayi3;
        String buyuk = " > ", kucuk = " < ";

        System.out.println("Sırasıyla 3 sayıyı giriniz. Program otomatik olarak küçükten büyüğe sıralayacaktır.");

        System.out.print("1. sayı: ");
        sayi1 = sc.nextInt();

        System.out.print("2. sayı: ");
        sayi2 = sc.nextInt();

        System.out.print("3. sayı: ");
        sayi3 = sc.nextInt();

        if ((sayi1 > sayi2) && (sayi1 > sayi3)) { // sayi1 en büyük mü kontrolü, eğer öyleyse en büyük sayi1 olur.
            if ((sayi1 > sayi2) && (sayi2 > sayi3)) { //sayi2 sayi3 den büyük mü kontrolü, eğer öyleyse sayi2 sayi3ten büyüktür.
                System.out.println(sayi3  + kucuk + sayi2 + kucuk + sayi1);
            } else if ((sayi1 > sayi2) && (sayi3 > sayi2)) {
                System.out.println(sayi2  + kucuk + sayi3 + kucuk + sayi1);
            }   
        } else if ((sayi2 > sayi1) && (sayi2 > sayi3)){ // sayi2 en büyük mü kontrolü, eğer öyleyse
            if ((sayi2 > sayi1) && (sayi1 > sayi3)) { //sayi1 sayi3 den büyük mü kontrolü, eğer öyleyse
                System.out.println(sayi3 + kucuk + sayi1 + kucuk + sayi2);
            } else if ((sayi2 > sayi1) && (sayi3 > sayi1)) {
                System.out.println(sayi1 + kucuk + sayi3 + kucuk + sayi2);
            }
        } else { //geriye en büyük 3.sayı olma durumu kaldı
            if (sayi1 > sayi2) { // eğer sayi1 sayi2den büyükse
                System.out.println(sayi2 + kucuk + sayi1 + kucuk + sayi3);
            } else { // eğer sayi1 sayi2den büyük değilse yani küçükse
                System.out.println(sayi1 + kucuk + sayi2 + kucuk + sayi3);
            }
        }

    }
}
