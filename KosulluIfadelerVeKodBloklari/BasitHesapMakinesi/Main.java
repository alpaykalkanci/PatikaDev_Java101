import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int number1, number2, operataion;

        System.out.print("1. sayıyı yazınız: ");
        number1 = input.nextInt();

        System.out.print("2. sayıyı yazınız: ");
        number2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n 1:+, 2:-, 3:*, 4:/");
        operataion = input.nextInt();

        switch (operataion) {
            case 1:
                System.out.println("İşlem sonucu: " + (number1 + number2));
                break;

            case 2:
                System.out.println("İşlem sonucu: " + (number1 - number2));
                break;
        
            case 3:
                System.out.println("İşlem sonucu: " + (number1 * number2));
                break;

            case 4:
                if (number2 == 0) {
                    System.out.println("HATA! 0 başka bir sayıya bölünebilir. Sonuç 0 olacaktır. Ancak bir sayı 0'a bölünemez!");
                    
                }else{
                    System.out.println("İşlem sonucu: " + (number1 / number2));
                    
                }
                break;
            default:
                System.out.println("İşlem için belirtilen 1-4 arası tuşlardan birine basınız!");
                break;
        }

    }
}
