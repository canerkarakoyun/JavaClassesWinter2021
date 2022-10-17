package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {
    public static void main(String[] args) {
        // kullanıcıdan gün isminin ilk harfini isteyin ve harfe uygun olan gün isimlerini yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen istediğiniz günün bas harfini giriniz");

        char ilkHarf=scan.next().toUpperCase().charAt(0);

        if (ilkHarf=='p' || ilkHarf=='P') {
            System.out.println("Pazar, Pazartesi veya Perşembe");

        }

        if (ilkHarf=='s' || ilkHarf=='S') {
            System.out.println("Sali");
        }

        if (ilkHarf=='c' || ilkHarf=='C') {
            System.out.println("Carsamba, Cuma ya da Cumartesi");
        }

        if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C') {
            System.out.println("Lütfen geçerli bir harf giriniz!!!");
        }

        scan.close();

    }
}
