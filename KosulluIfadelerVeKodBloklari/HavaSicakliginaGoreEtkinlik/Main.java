import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
    /*
     * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

        Scanner scanner = new Scanner(System.in);
        int sicaklikDegeri;

        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklikDegeri = scanner.nextInt();

        System.out.println("Sıcaklık değeri: " + sicaklikDegeri);

        if (sicaklikDegeri < 5) {
            System.out.println("Sizim için en uygun etkinlik \"Kayak\" gibi görünüyor");
        } else if (sicaklikDegeri >=5 && sicaklikDegeri < 15) {
            System.out.println("Sizim için en uygun etkinlik \"Sinema\" gibi görünüyor");
        } else if (sicaklikDegeri >=15 && sicaklikDegeri < 25) {
            System.out.println("Sizim için en uygun etkinlik \"Piknik\" görünüyor");
        }else {
            System.out.println("Sizim için en uygun etkinlik \"Yüzme\" görünüyor");        
        }

    }
}
