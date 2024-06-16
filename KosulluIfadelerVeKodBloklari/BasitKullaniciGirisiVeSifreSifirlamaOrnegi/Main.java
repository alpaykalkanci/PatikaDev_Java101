import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    
        /* İstenilen Durum:
         * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
         * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması 
         * gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." 
         * sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         * Kullanıcı adı: testuser, Password: testPassword!
         */

         Scanner input = new Scanner(System.in);

         String defaultUserName = "testuser", defaultPassword = "testPassword!";
         String userName, password, resetPassword;


            System.out.println("Sisteme giriş yapmak için kullanıcı adı ve şifrenizi yazınız!\n");

            System.out.print("Kullanıcı adınızı yazınız: ");
            userName = input.nextLine();

            System.out.print("Şifrenizi yazınız: ");
            password = input.nextLine();

            if (userName.equals(defaultUserName) && password.equals(defaultPassword)) {
                    System.out.println("Giriş başarılı.");

                } else if(userName.equals(defaultUserName) && !password.equals(defaultPassword)){
                    System.out.println("Kullanıcı adı doğru ancak, şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (E/H)");
                    resetPassword = input.next();

                    if ((resetPassword.equals("E")) || (resetPassword.equals("e"))) {
                        System.out.print("Yeni şifrenizi giriniz: ");
                        password = input.next();

                        if (password.equals(defaultPassword)) {
                            System.out.println("Dostum zaten aynı şifreyi girdin. Hani unutmuştun :)");
                        }else{
                            System.out.println("Yeni Şifre oluşturuldu!");
                            
                        }
                        
                    }else{
                        System.out.println("Şifreni sıfırlamak istemiyorsan başta şifreni girmelisin!");
                    }
                
                }
                else{
                    System.out.println("Kullanıcı adı veya şifre yanlış. Ama hangisi söylemem :) Tekrar");
                }      
    }
}
