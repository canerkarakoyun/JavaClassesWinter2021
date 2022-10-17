package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayı isteyin
        // Sayı pozitif ise "sayı pozitif" yazdırın
        // sayı 100'den küçükse "küçük sayı" yazdırın
        // sayı 1000'den büyükse "büyük sayı" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");

        int sayi= scan.nextInt();

        if (sayi>0) {
            System.out.println("sayi pozitif");
        }

        if (sayi<100) {
            System.out.println("küçük sayı");
        }

        if (sayi>1000) {
            System.out.println("büyük sayı");
        }



    }
}
