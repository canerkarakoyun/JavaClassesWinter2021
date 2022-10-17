package day03;

import java.util.Locale;
import java.util.Scanner;

public class C2_Scanner2 {

    public static void main(String[] args) {

        // Kullanıcıdan ismini isteyip ilk harfini büyü harf olarak yazdıracağız
        //mehmet==> M

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        // Stringde harflerin indexleri "0"dan başlar. İlk harfi almak istediğimizde index olarak "0" girmeliyiz.

        System.out.println("bas harfiniz: "+ ilkHarf);

        scan.close();


    }
}
