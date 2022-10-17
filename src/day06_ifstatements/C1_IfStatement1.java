package day06_ifstatements;

public class C1_IfStatement1 {
    public static void main(String[] args) {

        int a=10;
        int b=8;

        if (a>b) {  // sonuç True olduğundan if'in body'si içine girip işlemi yapar
            System.out.println("ilk sayi buyuk");
        }

        if (a*b<0) {  // işlem sonucu False olduğundan if body'si içine girmez ve bir sonraki satıra geçer, birşey yazdırmaz
            System.out.println("sayilarin carpimi negatif");
        }

        if (a<b || b>0) {
            System.out.println("or'lu cumle calisti");
        }

        if (a-b>0 && a*b>0) {
            System.out.println("and cumlesi calisti");
        }
    }
}
