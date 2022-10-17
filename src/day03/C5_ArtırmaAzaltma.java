package day03;

public class C5_ArtırmaAzaltma {

    public static void main(String[] args) {

        int num = 15;

        // bir sayıyı 2 artırmak istersek sayıyı 2 ile toplarız

        int num2 = num + 2; // ACEMİ İŞİ

        System.out.println("num2 = " + num2);
        System.out.println("num = " + num);

        num = num+5; // bu satırdan itibaren num değeri 20'dir.

        System.out.println("new num = " + num);

        // farklı bir artırma yöntemi de num +=5 şeklinde de olabilir. num değerini 5 artırır.

        num +=5; // USTA İŞİ

        System.out.println("new new num: "+num);

        num +=1;

        System.out.println("en new num: "+num);

        // sadece 1 artırmaya özel olarak java pratik metodu

        num ++; // ÇOK KULLANACAĞIZ

        System.out.println("num ++ değeri: "+num);


    }
}
