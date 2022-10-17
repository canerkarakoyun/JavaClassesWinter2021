package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf {
    public static void main(String[] args) {

        // kullanıcıdan 100 üzerinden notunu girmesini isteyini
        // 50'den küçükse "D", 50-60 arası "C", 60-80 arası "B", 80 üzeri "A"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not<0 || not>100) {
            System.out.println("Lütfen geçerli bir not giriniz!!!");
        } else if (not<50) { // notumuz 50 ile 100 arasında 50'den küçükse
            System.out.println("Notunuz D");
        } else if (not<60) { // notumuz 50 ile 100 arasında, 60'dan küçükse
            System.out.println("Notunuz C");
        } else if (not<80) { // notumuz 60 ile 100 arasında, 80'den küçükse
            System.out.println("Notunuz B");
        } else { // notumuz 80 ile 100 arasında, yukarıdaki seçeneklerden hiçbiri olmadıysa
            System.out.println("Notunuz A");
        }





    }
}
