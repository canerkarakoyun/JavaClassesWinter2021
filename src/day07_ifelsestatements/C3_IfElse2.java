package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {
    public static void main(String[] args) {

        // kullanıcıdan bir karakte girmesini isteyin
        // harf olup olmadığını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char karakter=scan.next().charAt(0);

        if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z')) {
            System.out.println("Girdiğiniz karakter harf");
        }   else {
            System.out.println("Girdiğiniz karakter harf değil");
        }
    }
}
