import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
         */

        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.print("Bir sayı giriniz: ");
        value = scanner.nextInt();

        for (int i = 1; i <= value ; i *= 4) {
            System.out.println("4'ün kuvvetleri: " + i);

        }

        System.out.println("************");

        for(int j = 1; j <= value; j *= 5){
            System.out.println("5'in kuvvetleri: " + j);
        }

    }
}
