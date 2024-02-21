import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        //3 kenar uzunluğu kullanıcıdan alınacak
      
      //Değişken tanımlama
        double a, b, c , h, cevre, alan;

        //kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a = input.nextDouble();
        System.out.print("2. kenarı giriniz: ");
        b = input.nextDouble();
        System.out.print("3. kenarı (taban) giriniz: ");
        c = input.nextDouble();
        System.out.print("Üçgenin yüksekliğini giriniz: ");
        h =  input.nextDouble();

        //alınan değerlerle işlem yapma ve sonucu ekranda gösterme


        cevre = (a+b+c);
        alan = (c*h) / 2;
        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);

    }

}
