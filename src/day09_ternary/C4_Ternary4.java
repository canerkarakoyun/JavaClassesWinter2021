package day09_ternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C4_Ternary4 {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayi isteyelim, sayinin tek mi çift mi olduğunu yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");

        // sayinin mutlak değerini yazdıralım

        System.out.println("sayinin mutlak degeri: " + (sayi<0 ? -sayi : sayi));

    }
}
