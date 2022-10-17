package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

    public static void main(String[] args) {

        // Kullanıcıdan ismini ve soyismini isteyerek aralarına boşluk bırakarak yazdıralım.

        Scanner scan=new Scanner (System.in);

        System.out.println("Lütfen adınızı giriniz");

        String name=scan.nextLine();

        System.out.println("Lütfen soyadınızı giriniz");

        String surname=scan.nextLine();

        System.out.println(name+" "+surname);

        scan.close();
    }
}
