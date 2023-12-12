import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Login {
    public static void main(String[] args) {


            String id;
            String password;

            do{
                Scanner cin = new Scanner(System.in);
                System.out.print("Masukkan Akun     : ");
                id = cin.next();
                System.out.print("Masukkan Password : ");
                password = cin.next();
                if(id.equalsIgnoreCase("admin") && password.equals("admin123")){
                    int random;
                    String n;
                    do{
                        System.out.println("Captcha SADW543KLJ" );
               
                        System.out.print("Masukkan Captcha : ");
                        n = cin.next();
                    }while(!n.equalsIgnoreCase("SADW543KLJ"));

                    System.out.println("Akun Ditemukan");
                    break;
                }else{
                    System.out.println("Coba Lagi");
                }
            }while(!id.equals("admin") || !password.equals("admin123"));

    }
}
