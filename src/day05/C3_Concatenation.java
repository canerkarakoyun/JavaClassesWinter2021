package day05;

public class C3_Concatenation {

    public static void main(String[] args) {

        // Concatination (Birleştirme) : Java'da birden fazla String'i + işareti ile
        // toplarsanız, Java bu Stringleri yan yana yazar.

        String str1="Java";
        String str2="Guzeldir";

        System.out.println(str1+" "+str2);

        int sayi1=5;
        int sayi2=4;

        System.out.println(sayi1+sayi2+" "+str1+str2); // string varsa sayı kısmını toplar, sonrasını concatination yapar.

        System.out.println(sayi1+sayi2+' '+str1+str2); // char ile karşılaşırsa karakterin ASCII değerini alıp matematiksel işlem yapar.

        System.out.println(sayi1+sayi2+str1+' '+str2); // char'ın iki tarafı da string olursa içindeki karakteri girer.

        // Kural 1; eğer toplanan değerlerden bir tanesi String ise Java toplama değil concatination yapar.

        // Kural 2; eğer toplanan değerlerin ikisi de sayıysa Java matematiksel işlem yapar.

        // Kural 3; eğer sayı ve String değişkenler birlikte kullanılacaksa, öncelikler belirlenip
        // o işlemler için () kullanılabilir.

        // Kural 4; matematiksel bir işlemde char değişken kullanılırsa Java char'ın ASCII değerini
        // işleme alır.

        // Kural 5; char bir değişken ile String bir değişken toplanırsa Java concatination yapar.


    }
}
