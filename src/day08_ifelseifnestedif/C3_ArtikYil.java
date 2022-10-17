package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtikYil {
    public static void main(String[] args) {

        // Kullanıcıdan yıl iste, artik yil olup olmadigini belirtin;
        // Kural 1: 4 ile bolunebilen yillar artik yildir
        // Kural 2: 4'ün katı olmasına rağmen 100'ün katı olup 400'ün katı olmayan yıllar artık yıl değildir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yil giriniz");

        int yil= scan.nextInt();

        if (yil%4!=0){
            System.out.println("Artik yil degil");
        } else if (yil%4==0){
            if ((yil%100==0) && (yil%400!=0)){
                System.out.println("Artik Yil Değil");
            } else {
                System.out.println("Artik Yil");
            }
        }


    }
}
