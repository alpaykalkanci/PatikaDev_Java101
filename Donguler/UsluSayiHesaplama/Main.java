import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int j, k, total = 1;

        System.out.print("Üssü alıncak sayıyı giriniz: ");
        j = scanner.nextInt();

        System.out.print("Üssü grininiz: ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++){
            total *= j;
        }

        System.out.println("Sonuç: " + total);


    }
}
