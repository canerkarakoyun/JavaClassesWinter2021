package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {
    public static void main(String[] args) {

        // kullanıcıdan üçgenin kenar uzunluklarını alın
        // üç kenar eşitse eşkenar yazdırın, değilse eş kenar değil yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2==kenar3) {
            System.out.println("Eşkenar Üçgen");
        } else {
            System.out.println("Eşkenar Üçken Değil");
        }
    }
}
