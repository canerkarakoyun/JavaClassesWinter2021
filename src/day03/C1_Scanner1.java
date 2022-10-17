package day03;

import java.util.Scanner;

public class C1_Scanner1 {

    public static void main(String[] args) {

        // Scanner 3 adım gerektiriyor;
        // 1. Scanner objesini oluşturuyoruz (Scanner scan=new Scanner (System.in)
        // 2. Kullanıcıya mesaj giriyoruz (sout)
        // 3. Veriable oluşturacağız (String vb)

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Adınızı Giriniz:");

        String name = scan.nextLine();

        System.out.println("Lütfen Soyadınızı Giriniz");

        String surname = scan.nextLine();

        System.out.println("Isminiz: " + name);
        System.out.println("Soyisminiz: " + surname);
        System.out.println("Kursumuza kaydınız alınmıştır, teşekkür ederiz.");

        scan.close();


    }
}
