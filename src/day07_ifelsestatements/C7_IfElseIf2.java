package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {
    public static void main(String[] args) {

        // kullanıcıdan iki sayı isteyin
        // sayıkardan ikisi de pozitif ise satıları toplatın
        // sayıların ikisi de negatif ise sayıarın çarpımını yazdırın
        // sayılar farklı işaretlere sahipse "farklı işarette sayılarla işlem yapamazsın" yazdıralım
        // sayılardan biri sıfıra eşit ise "sıfır çarpmaya göre yutan elemandır" yazdıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        if (sayi1>0 && sayi2>0) {
            System.out.println("Sayilarin Toplami :" + (sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0) {
            System.out.println("sayilarin Carpimi :"+(sayi1*sayi2));
        } else if (sayi1==0 || sayi2==0) {
            System.out.println("sıfır çarpmaya göre yutan elemandır");
        } else {
            System.out.println("farklı işarette sayılarla işlem yapamazsın");
        }


    }
}
