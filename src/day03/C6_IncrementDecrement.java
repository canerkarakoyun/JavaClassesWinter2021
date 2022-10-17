package day03;

public class C6_IncrementDecrement {

    public static void main(String[] args) {

        int number=10;

        // bir veriable değerini toplayarak artırmak için 3 yöntem kullanabilirim.
        // 1. yöntem (ACEMİ YÖNTEMİ)

        number=number+5;

        // 2. yöntem (USTA İŞİ)

        number += 5;

        // 3. yöntem (Sadece 1 artırmak için geçerli)

        number++;

        // bu yöntemler sadece toplama işlemine has değildir, tüm işlemler için kullanılabilir.
        // 3. yöntem sadece +/- için kullanılır, çarpma ve bölme için kullanılamaz.

        System.out.println("number: " + number);

        number -=6;

        System.out.println("eksilen number: "+ number);

        number /=3;

        System.out.println("bölünen number: "+number);

        number *=5;

        System.out.println("çarpılan number: "+ number);

        number --;

        System.out.println("1 eksilen number: " + number);


    }
}
