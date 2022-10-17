package day10_SwitchCase;

import java.util.Scanner;

public class C2_TernaryTekrar2 {
    public static void main(String[] args) {

        // kullanıcıdan bir sayi alin, sayi cift ise cift yazdırın, degil ise sayinin karesini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi= scan.nextInt();

        // eger ternary'de iki durum icin farkli data tipleri donusu oluyorsa
        // ya veriable'a atama yapmadan direkt yazdırırız
        // ya da mumkunse sonuclari aynı data tipine cevirmeye calisiriz
        // asagida sayi*sayi bir int, öncesi ise String, sayi*sayi'nın sonun +"" eklersek String olarak kabul eder Java

        String sonuc=sayi%2==0 ? "cift" : sayi*sayi+"";
        System.out.println(sonuc);

        System.out.println(sayi%2==0 ? "cift" : sayi*sayi);

    }
}
