package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyin ve sayının tek veya çift sayı olduğunu yazdırın.

        // kullanıcıdan bir sayi isetnir, Scanner
        // bu sayi içeri alinir (import), int sayi=scan.nextint()
        // Bu sayının tek mi çift mi olduğunu anlamak için ikiye bölünüp kalanına bakılır, Modulus (%)
        // kalan 1 ise tek, kalan 0 ise çift olduğunu belirtmek için if statement kullanılır.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi=scan.nextInt();

        if (sayi%2==0) {
            System.out.println("Girdiğiniz sayi çift sayidir");
        }

        if (sayi%2==1 || sayi%2==-1) {
            System.out.println("Girdiğiniz sayi tek sayidir");
        }

        System.out.println("Katildiğiniz için teşekkür ederiz");

        scan.close();
    }
}
