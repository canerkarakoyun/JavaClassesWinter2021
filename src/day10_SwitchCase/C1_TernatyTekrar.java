package day10_SwitchCase;

import java.util.Scanner;

public class C1_TernatyTekrar {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, sayi 3 basamakliysa "uc basamakli sayi" yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi= scan.nextInt();

        String sonuc= sayi>99 ? (sayi<1000 ? "sayi uc basamakli" : "uc basamakli degil") : "uc basamakli degil";

        System.out.println(sonuc);

        // Nested Turnery olmasını istemezsek

        String sonuc2=sayi>=100 && sayi<1000 || sayi<=-100 && sayi>-1000 ? "Uc Basamakli sayi" : "Uc Basamakli Degil" ;

        System.out.println(sonuc2);

        // basit durumlarda Ternary kullanabilir ama zor durumlarda Ternary yapmak çok karışık olabilir.
        // if statement kullanmak daha temiz ve anlaşıır olur



    }
}
