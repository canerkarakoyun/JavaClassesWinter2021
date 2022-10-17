package day04;

import java.util.Scanner;
import java.util.function.ObjIntConsumer;

public class C3_Modulus2 {

    public static void main(String[] args) {

        // kullanıcıdan 4 basamaklı bir sayı alalım ve sayının basamaklarını ters sırada yazdıralım.
        // bir sayının basamaklarını elde etmek için 2 işlemi tekrar tekrar yaparız.
        // 1. işlem: en sondaki basamağı elde etmek
        // 2. işlem: en sondaki basamağı yok etmek

        Scanner scan=new Scanner (System.in);

        System.out.println("Lütfen 4 basamaklı bir sayı giriniz");

        int sayi=scan.nextInt(); // 4 basamaklı sayıyı aldık

        // 1. tekrar

        int birlerBas=sayi % 10;

        sayi /=10;

        // 2. tekrar

        int onlarBas= sayi % 10;

        sayi /=10;

        // 3. tekrar

        int yuzlerBas= sayi % 10;

        sayi /= 10;

        // tum basamakları elde ettik
        // tüm basamakları yazdıralım;

        System.out.println("Birler Basamagi: " + birlerBas);
        System.out.println("Onlar Basamagi: " + onlarBas);
        System.out.println("Yuzler Basamagi: " + yuzlerBas);
        System.out.println("Binler Basamagi: " + sayi);

        // sayıyı tersten yazdıralım;

        System.out.print(birlerBas);
        System.out.print(onlarBas);
        System.out.print(yuzlerBas);
        System.out.print(sayi);

        System.out.println(); // print yazdırdığımdan alt satıra geçmek için bunu yapmak gerekiyor)
                              // 52. satırdaki kodu println şeklinde yazarsak bu satıra gerek kalmaz.

        // farklı yöntem;

        System.out.println(birlerBas+onlarBas+yuzlerBas+sayi);

        System.out.println(""+birlerBas+onlarBas+yuzlerBas+sayi);

        scan.close();








    }
}
