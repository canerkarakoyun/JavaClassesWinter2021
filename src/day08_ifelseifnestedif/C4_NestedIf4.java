package day08_ifelseifnestedif;

import java.io.FileFilter;
import java.util.Scanner;

public class C4_NestedIf4 {
    public static void main(String[] args) {

        // Kullanıcıdan bir sifre isteyelim;
        // Ilk harf buyuk harf ise "A" olup olmadigina bakacagiz,
        // "A" ise "Gecerli Sifre", degilse "Geçersiz Sifre" yazdiracagiz.
        // Ilk harf kucuk harf ise "z" olup olmadigina bakacagiz,
        // "z" ise "Gecerli Sifre", degilse "Geçersiz Sifre" yazdiracagiz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz");

        char ilkHarf= scan.next().charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z') { // ilk harf büyükse çalışacak.
            if (ilkHarf=='A') {
                System.out.println("sifre gecerli");
            } else {
                System.out.println("sifre gecersiz, buyuk harf");
            }

        } else if (ilkHarf>='a' && ilkHarf<='z') { // ilk harf küçük ise calisacak.
            if (ilkHarf=='z') {
                System.out.println("sifre gecerli");
            } else {
                System.out.println("sifre gecersiz, kucuk harf");
            }


        } else { // ilk harf buyuk ya da kucuk degilse
            System.out.println("sifre gecersiz, tanımsız");

        }

    }
}
