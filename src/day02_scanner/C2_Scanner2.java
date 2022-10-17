package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

    public static void main(String[] args) {

        // Dairenin yarıçapını kullanıcıdan isteyerek dairenin alanını hesaplatalım

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Dairenin Yarıçapını Giriniz");

        Double r= scan.nextDouble();

        System.out.println("Dairenin Alanı= "+3.14*r*r);

        scan.close();
    }
}
