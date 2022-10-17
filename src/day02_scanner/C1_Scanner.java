package day02_scanner;


import java.util.Scanner;

public class C1_Scanner {
    public static void main (String [] args) {

         // Scanner ile kullanıcıdan bilgi alabiliri
        // 3 adımla scanner işlemini gerçekleştiriyoruz;

        // 1. Adım: Scanner objesi oluşturacağız

        Scanner scan = new Scanner(System.in);

        // new : Java'da ne zaman "new" kelimesini görsek yeni bir object oluşturuluyor demektir.
        // parantezin içine yazılan değerlere parametre diyoruz ve Scanner için System.in yazmamız gerekir
        // Bir kod yazdığımızda kodun altına kırmızı çizgi oluşuyorsa veya satır numarası kırmızı x olursa
        // sorun var demektir.
        // java.util Java'nın bizim için hazırladığı bir kütüphanedir. İhtiyaç duyduğumuzda gerekli kodları
        // class'a import etmemiz yeterlidir.
        //"scan" oluşturduğumuz scanner objesine verdiğimiz isimdir. Farklı isimler de verebiliriz.
        // ancak "scan" ismi tüm programcılar tarafından kullanıldığından, kodlarımızın anlaşılır olması için
        // "scan" kullanılması tavsiye edilir.

        // 2. adım: kullanıcıya bir mesaj yazarız. bunun için de System.out.print.ln(""); kullanırız.

        System.out.println("Karenin bir kenar uzunluğunu girin");

        // 3. adım: kullanıcının konsola girdiği değeri programımıza alacağız
        // ve bir Variable değeri oluşturup değer atayacağız.
        // kullanıcıdan bir kenar uzunluğu istediğim için kullanıcı küçük bir sayı da girebilir, büyük bir
        // sayı da girebilir. Tam sayı da yazabilir, kesirli sayı da yazabilir. Bundan dolayı kullanmamız
        // gereken data type "double" olmalı.

        double kenar=scan.nextDouble();

        System.out.println("Karenin Alanı="+kenar*kenar);

        scan.close();



    }
}
