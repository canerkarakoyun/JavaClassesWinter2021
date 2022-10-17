package day10_SwitchCase;

import java.util.Scanner;

public class C5_SwitchCase3 {
    public static void main(String[] args) {
        // kullanıcıdan hangi günde olduğumuzu isteyin (yazıyla). Girilen günün hafta içi veya hafta sonu olduğunu
        // yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen güncel günü yazı olarak giriniz");
        String gun= scan.nextLine().toLowerCase();

        switch (gun){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta Ici");
                break;
            case "cumartesi":
            case "pazar":
                break;

                // Birden fazla durum aynı sonucu veriyorsa araya kod yazmadan case'leri alt alta sıralayabiliriz
            // bu durumda break'i aynı sonucu veren son durumdan sonra yazabiliriz.
        }
    }
}
