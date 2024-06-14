import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        double ortalama = 0;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);

        System.out.println("Not ortalamasını giriniz: ");
        ortalama = input.nextDouble();

        System.out.println(ortalama > 45 ? "Geçti" : "Kaldı");
    
    }
}
