package day04;

public class C2_ModulusOperatoru {

    public static void main(String[] args) {
        // modulus operatörü bölme işleminde kalanı verir.

        // 15 tek mi çift mi ? 15/2 kalan=1 ise sayı tektir, kalan 0 ise sayı çifttir.
        // 25 üçe bölünür mü ? 24/3 kalan=1, kalan 0 olmadığı müddetçe bölünmez.
        // herhangi bir sayının, başka herhangi bir sayı ile bölünebilirliğini kontrol etmek için
        // modulus işlemi kullanılır.
        // modulus işleminin işareti % işaretidir.

        int kalan = 15 % 4; // 3

        System.out.println(kalan);

        System.out.println(26 % 8); // 2

        // 856 sayısının birler basamağı kaçtır? Sayıyı gördüğümüzden kolay geliyor.
        // Ancak kullanıcının girdiği sayının birler basamağı ne dersek modulus kullanırız.

        int sayi = 856;

        int birlerBasamagi = 856 % 10;

        System.out.println("sayinin birler basamagi: " + birlerBasamagi);

        // 856 sayısının onlar basamağı kaçtır? sayının birler basamağını bulduktan sonra
        // bu basamağı atarsak geriye 85 kalır ve onlar basamağı birler basamağı durumuna düşer ve
        // modulus % 10 ile bulunabilir.

        sayi /= 10;

        System.out.println(sayi);

        int onlarBasamagi = sayi % 10;

        System.out.println("sayının onlar basamagi: " + onlarBasamagi);

        sayi /= 10;

        int yuzlerBasamagi = sayi % 10;

        System.out.println("sayının birler basamagi: " + yuzlerBasamagi);





    }
}
