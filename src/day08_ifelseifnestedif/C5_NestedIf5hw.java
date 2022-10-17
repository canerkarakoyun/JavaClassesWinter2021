package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf5hw {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyelim, sayının 5'e bölünüp bölünmediğini kontrol edelim
        // eger sayi 5'e bölunuyor ve son rakamı 0 ise "5'e bolunen cift sayi" yazdırın
        // eger sayi 5'e bolunuyor ve son rakamı 5 ise "5'e bolunen tek sayi" yazdırın
        // eger sayi 5'e bolunemiyorsa "5'e bolunemeyen sayi" yazdıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz!!!");

        double sayi= scan.nextDouble();

        if (sayi%5==0) {
            if (sayi % 10 == 0) {
                System.out.println("5 ile bolunebilen cift sayi");
            } else {
                System.out.println("5 ile bolunebilen tek sayi");
            }

        }else {
                System.out.println("5 ile bolunemeyen sayi");
            }

        }
    }
