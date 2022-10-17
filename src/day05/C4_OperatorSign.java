package day05;

public class C4_OperatorSign {

    public static void main(String[] args) {

        // Java'da = işaretinin adı "eşittir" değil, atama (assignment)'dır.

        // Mantıksal Operatörler

        int sayi1=5;
        int sayi2=4;

        boolean isGreat= sayi1>sayi2; // bu ifadenin sonucu ya da cevabı true ya da false'dur.

        System.out.println(isGreat); // true olması beklenir.

        boolean isSmall= sayi1<=sayi2; // ilk = assignment, ikinci = eşittir anlamındadır.

        // assignment işaretinin solunda veriable olur, sağ tarafında işlem olur.
        // <= : küçük-eşittir demek.

        System.out.println(isSmall); // false olması beklenir.

        boolean isEqual= sayi1==sayi2; // matematikte == diye bir işlem yok.
                                       // Java'da == "eşit mi?" anlamına gelir ve "comparison operator"
                                       // şeklinde tanımlanır. Comparidon: Karşılaştırma
        System.out.println(isEqual);

        System.out.println(sayi1==5); // sayi 1 5'e eşit mi?

        System.out.println(sayi1*sayi2==20); // sayi1*sayi2 işlemi 20'ye eşit mi?

        // Java'da == eşit mi? demekti. != işareti eşit değil midir? anlamına gelir.

        System.out.println(sayi1!=5); // "sayi1 eşit değildir 5, değil mi?" sonuç false gelir.
        System.out.println(sayi1+sayi2!=9); // false
        System.out.println(sayi1+sayi2!=10); // true

        // tüm mantıksal ifadelerde ! kullanıldığında olumsuzluk anlamı katar.
        // != eşit değil
        // !< küçük değil, !> büyük değildir.


    }
}
