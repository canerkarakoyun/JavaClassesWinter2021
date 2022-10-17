package day10_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase1 {
    public static void main(String[] args) {
        // Kullanıcıdan bir rakam isteyin, girilen rakamı yazı ile yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");

        int sayi= scan.nextInt();

        if (sayi==0){
            System.out.println("sifir");
        } else if (sayi==1) {
            System.out.println("bir");
        } else if (sayi==2) {
            System.out.println("iki");
        } else if (sayi==3){
            System.out.println("uc");
        } else if (sayi==4){
            System.out.println("dort");
        } else if (sayi==5){
            System.out.println("bes");
        } else if (sayi==6){
            System.out.println("alti");
        } else if (sayi==7){
            System.out.println("yedi");
        } else if (sayi==8){
            System.out.println("sekiz");
        } else if (sayi==9){
            System.out.println("dokuz");
        } else {
            System.out.println("Lutfen gecerli bir deger giriniz!!!");
        }


        // Soruyu Switc ile yapalim

        switch (sayi) {
            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Lutfen geçerli bir rakam giriniz");

        }
    }
}
