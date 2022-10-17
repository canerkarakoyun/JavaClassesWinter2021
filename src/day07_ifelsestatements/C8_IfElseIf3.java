package day07_ifelsestatements;

import java.util.Scanner;

public class C8_IfElseIf3 {
    public static void main(String[] args) {

        // kullanıcıdan maaş teklifi isteyin
        // Yıllık 80.000 ve üzeri için "Kabul Ediyorum"
        // Yıllık 60.000 - 80.000 arası ise "Düşünmem Gerekiyor"
        // Yıllık 60.000'in altında olursa "Malesef Kabul Edemiyorum" yazdıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yıllık maaş teklifini giriniz");

        double maas= scan.nextDouble();

        if (maas>80000) {
            System.out.println("Kabul Ediyorum");
        } else if (maas>=60000){
            System.out.println("Düşünmem Lazım");
        } else {
            System.out.println("Malesef teklifinizi kabul edemeyeceğim");
        }
    }
}
