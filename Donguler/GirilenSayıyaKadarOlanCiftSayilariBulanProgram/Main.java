import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
         */

        Scanner input = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Toplamın şu anki değeri: " + total + "\n");

        do {
            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }

            System.out.print("Toplamın şu anki değeri: " + total + "\n");

        } while (number % 2 == 0);

        System.out.println("\nGirdiğiniz sayılardan çift ve 4'ün katları olan sayıların toplamı: " + total);

    }
}
