package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElse1 {
    public static void main(String[] args) {

        // kullanıcıdan diktörgenin kenar uzunluklarını alın
        // uzunluklar eşit ise kare, değilse kare değil yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen dikdörtgenin ilk kenar değerini giriniz");
        int kenar1= scan.nextInt();

        System.out.println("Lütfen dikdörtgenin ikinci kenar değerini giriniz");
        int kenar2= scan.nextInt();

        if (kenar1==kenar2) {
            System.out.println("Kare");
        }   else {
            System.out.println("Dikdörtgen");
    }
}
}
