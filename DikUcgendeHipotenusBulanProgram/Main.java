
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        //Değişken tanımlama

        double a, b, c;

        //kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a = input.nextDouble();
        System.out.print("2. kenarı giriniz: ");
        b = input.nextDouble();

        //alınan değerlerle işlem yapma, Math sınıfı ile karekök işlemi ve sonucu ekranda gösterme
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Dik üçgenin 1. kenarı: " + a + "\nDik üçgenin 2. kenarı: " + b);
        System.out.println("Dik üçgenin hipotenüsü: " + c);

    }

}
