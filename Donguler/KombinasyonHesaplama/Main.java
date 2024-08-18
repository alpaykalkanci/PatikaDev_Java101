import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Kombinasyon, belirli bir kümeden seçilen elemanların sırasız olarak oluşturduğu alt kümelerdir.
        Matematikte kombinasyon, n elemanlı bir kümeden r elemanlı alt kümelerin sayısını ifade eder.

        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */

        System.out.println("\nKombinasyon formülü: C(n,r) = n! / (r! * (n-r)!)");

        int n, r, nFak = 1, rFak = 1, n_rFak = 1, n_r, combination;

        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        //n faktöriyel hesaplama
        for(int i = 1; i <= n; i++){

            nFak = nFak * i;
        }
        System.out.println(n + "! sonucu: " + nFak);

        //r faktöriyel hesaplama
        for (int j = 1; j <= r; j++){

            rFak = rFak * j;
        }
        System.out.println(r + "! sonucu: " + rFak);

        //n-r faktöriyel hesaplama
        n_r = n - r;

        for(int k = 1; k <= n_r; k++){
            n_rFak = n_rFak * k;
        }
        System.out.println(n + "-" + r + " = " + n_r  + "! sonucu: " + n_rFak);

        //formülde değerleri yerine koyma
        combination = nFak / (rFak * n_rFak);

        System.out.printf("%d’in %d’li kombinasyonu C(%d,%d)= ", n,r,n,r);
        System.out.printf("%d! / (%d! * (%d-%d)!) = %d / (%d * %d) = %d",n,r,n,r,nFak,rFak, n_rFak, combination);


    }
}
