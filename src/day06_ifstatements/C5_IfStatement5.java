package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {
    public static void main(String[] args) {

        // Kullanıcıdan bir dikdötgenin iki kenar uzunlupunu alın
        // Kenar uzunlukları eşitse kare, eşit değilse dikdörtgen yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk kenar değerini giriniz");

        double kenar1= scan.nextDouble();

        System.out.println("Lütfen ikinci kenar değerini giriniz");

        double kenar2= scan.nextDouble();

        if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
            System.out.println("Kare");
        }

        if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
            System.out.println("Dikdörtgen");
        }

        if (kenar1<=0 || kenar2<=0) {
            System.out.println("Lütfen geçerli bir değer giriniz");
        }
    }
}
