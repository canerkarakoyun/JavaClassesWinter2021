package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alalim ve buyuk olani yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayiyi giriniz");
        double birinci= scan.nextDouble();
        double ikinci= scan.nextDouble();

        System.out.println(birinci<ikinci ? ikinci : birinci);

    }
}
