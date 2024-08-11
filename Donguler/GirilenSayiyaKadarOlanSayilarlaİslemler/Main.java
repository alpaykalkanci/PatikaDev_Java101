import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    
    /* 
     * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
     *  3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
     * 
     */

    Scanner scn = new Scanner(System.in);
    int girilenSayi, toplam = 0;

    System.out.print("Bir sayı giriniz: ");
    girilenSayi = scn.nextInt();

    for(int i = 0; i <= girilenSayi; i++){

        if(i % 3 == 0 && i %4 ==0){

            System.out.println(i + ", 3e ve 4e tam bölünür.");
            toplam = toplam + i;
        }
        
    }

    System.out.println("Girdiğiniz sayıya kadar olan 3e ve 4e tam bölünebilen sayıların toplamı: " + toplam);

    }
}
