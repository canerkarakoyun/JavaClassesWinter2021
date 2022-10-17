package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {
    public static void main(String[] args) {

        // kullanicidan dikdörgenin uzunlugunu ve genisligini alalım ve dikdörtgen mi kare mi olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdörgenin kenar uzunluklarını tam sayi olarak giriniz");
        Double kenar1= scan.nextDouble();
        Double kenar2= scan.nextDouble();

        System.out.println(kenar1>0 && kenar2>0 ? (kenar1.equals(kenar2) ? "kare" : "dikdortgen") :
                "Lutfen gecerli bir deger giriniz");



    }
}
