package day09_ternary;

public class C1_Ternary1 {
    public static void main(String[] args) {

        // ternary islemi bir sonuc dondurdugunden bir veriable (String) olusturup ona assign (esitlemeliyiz) etmeliyiz

        int sayi=10;

        String sonuc = sayi%2==0 ? "cift sayi" : "tek sayi";

        System.out.println(sonuc);

        // ben bir variable'a assign etmek istemezsem ne yapabilirim?
        // onun için sout içerisine yazabiliriz

        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");

        // basina aciklama yazmak istersem;

        System.out.println("islem sonucu: " + (sayi%2==0 ? "cift sayi" : "tek sayi"));



    }
}
