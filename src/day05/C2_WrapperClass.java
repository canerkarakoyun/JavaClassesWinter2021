package day05;

import java.nio.ByteBuffer;
import java.sql.SQLOutput;

public class C2_WrapperClass {

    public static void main(String[] args) {

        // Java'da iki ata türü vardı;
        // primitive ve non-primitive
        // 1. primitivler sadece value içerir, non-primitiveler ise metod da içerir.

        String isim="mehmet";
        System.out.println(isim.toUpperCase());

        // Wrapper Class : Java'nın primitive data türleri ile bazı metotları kullanabilmemiz için
        //                  oluşturduğu class'lardır.

        // boolean, char, byte, short, int, long, float, double (8 primitive data tipi)

        byte sayi=10; // primitive data type

        Byte sayi2=11; // ismen primitive data typelar ile aynı olup primitive olmayan
                        // data tiplerine Wrapper Data olur.

        System.out.println(sayi2);

        // bizler Wrapper Class'lar sayesinde bazı method'lara ulaşırız.

        Byte byteMinSayi = Byte.MIN_VALUE;
        System.out.println(byteMinSayi);

        Byte byteMaxsayi = Byte.MAX_VALUE;
        System.out.println(byteMaxsayi);

        // variable oluşturmadan direkt olarak shortun minimum ve maximum değerlerini yazdıralım.

        System.out.println(Short.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);

        // integer veri türünün Wrapper Class'ı "Integer"'dır.

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // char veri türünün Wrapper Class'ı da "Character"'dir.

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        // Wrapper Class'lar: Boolean, Character, Byte, Short, Integer, Long, Float ve Double.


    }
}
