package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse {
    public static void main(String[] args) {

        // kullanıcıdan yaşını sorun, 65'den büyükse "emekli olabilirsin" yoksa "emekli olamazsın" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");

        int yas=scan.nextInt();

        if (yas>=65) {
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsınız");
        }



    }
}
