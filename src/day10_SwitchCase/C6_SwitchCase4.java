package day10_SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class C6_SwitchCase4 {
    public static void main(String[] args) {
        // kullanııdan VIP kısatlmasinda hangi harfin anlamını istediğini soralım
        // verilen harfin aciklamasini yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aciklamasini istediginiz VIP harfini giriniz");

        char harf=scan.next().toUpperCase().charAt(0); // bu durumda kullanıcı ne girerse girsin ilk harfini alacak

        switch (harf){
            case 'V':
                System.out.println("Very");
                break;
            case 'I':
                System.out.println("Important");
                break;
            case 'P':
                System.out.println("Person");
                break;
            default:
                System.out.println("Lutfen gecerli bir veri giriniz!!!");
        }
        // kullanicinin tek har girmesini ve birden fazla harf girmesi durumunda bunu kullanıcıya hata
        // olarak bildirmek istiyorsak
        System.out.println("Lutfen aciklamasini istediginiz VIP harfini giriniz");

        String str=scan.next().toUpperCase(); // kullanıcı ne girerse onu alır

        switch (str){
            case "V":
                System.out.println("Very");
                break;
            case "I":
                System.out.println("Important");
                break;
            case "P":
                System.out.println("Person");
                break;
            default:
                System.out.println("Lutfen gecerli bir veri giriniz!!!");
        }

    }
}
