package day05;

public class C5_ConditionalOperators {

    public static void main(String[] args) {

        // Conditional Operators (Şart, Koşul)
        // AND (&&), OR (|| Alt Gr + (-) tuşu || Alt Gr + "<>" tuşu)

        // AND Operatörü;

        boolean isTrue= 5>4 && 7-3>0;

        // Java && işaretini gördüğünde sağ tarafını ve sol tarafını ayrı ayrı değerlendirir.
        // && ile bağlanan mantıksal ifadelerin hepsi True ise sonuç True'dir.
        // İçlerinden biri bile False olsa sonucu False verir.
        // && operatörü mükemmeliyetçidir, en ufak hatayı kabul etmez :))

        System.out.println(isTrue); // True

        int x=10;
        int y=5;

        System.out.println(x/y==2 && x*y>20 && x-y>0); // 3 işlem ed True, sonuç True

        System.out.println(x+y<0 && x-y>0); //ilk ifade False, ikinci ifade True, sonuç False

        // NOT: Java işlemler &&'li işlemler silsilesinde False bulduğu anca geri kalanına bakmaz False verir.

        // OR Operatörü;
            // OR Operatörü optimisttir, verilen silsileden 1 tanesi bile True olsa sonuç True verir.
            // Hepsi birden false olursa False sonucu verir sadece

        System.out.println(x<y || x+y<0 || x*y>0);




    }
}
