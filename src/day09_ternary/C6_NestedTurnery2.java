package day09_ternary;

import java.util.Scanner;

public class C6_NestedTurnery2 {
    public static void main(String[] args) {

        // kullanıcıdan bir harf isteyin, kucuk harf ise konsola "Kucuk Harf"
        // buyuk harf ise konsola "Buyuk Harf" yoksa "girdiginiz karakter harf degildir" yazdıralım.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char ilkHarf= scan.next().charAt(0);

        System.out.println(ilkHarf>='A' && ilkHarf<='Z' ? "Buyuk Harf" :
                           ilkHarf>='a' && ilkHarf<='z' ? "Kucuk Harf" : "girdiginiz karakter harf degildir") ;


    }
}
