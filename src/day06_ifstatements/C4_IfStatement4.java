package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {
    public static void main(String[] args) {

        // kullanıcıdan gün ismini isteyin
        // girilen günün hafta içi ya da hafta sonu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");

        String gun=scan.next().toLowerCase();

        // eğer String'lerde eşitlik sorguluyorsak  == kullanmıyoruz.
        // Stringlerde eşitlik durumunu sorgulamak için equal() metodunu kullanacağız.

        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Hafta Sonu");
        }

        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Hafta İçi");
        }
        scan.close();


    }
}
