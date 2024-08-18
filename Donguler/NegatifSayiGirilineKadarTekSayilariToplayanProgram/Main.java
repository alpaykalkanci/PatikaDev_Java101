import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*
    Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden tek sayıları toplayıp ekrana basan program.
     */

        Scanner input = new Scanner(System.in);
        int number, total = 0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        while (number >= 0) {
            System.out.println("Toplam değeri şu anda: " + total);
            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();
            if (number % 2 == 1) {

                total += number;
            }
        }

        System.out.printf("Toplam: %d\n", total);
    }
}
