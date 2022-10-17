package day02_scanner;

import java.util.Scanner;

public class C4_Budabenden {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Adınızı Giriniz");

        String seven= scan.nextLine();

        System.out.println("Lütfen Sevdiğinizin Adını Giriniz");

        String sevilen= scan.nextLine();

        System.out.println(seven+" "+sevilen+"'i seviyor :))");

        scan.close();
    }
}
