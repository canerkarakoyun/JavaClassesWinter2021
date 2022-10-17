package day05;

public class C1_ModulusSon {

    public static void main(String[] args) {

        // verilen bir integerin birler basamağındaki sayıyı yazdırın.
        // verilen demek kullanıcıdan alınan değil, başka bir ortamdan alınacak ya da verilecek.

        int sayi=1469;

        System.out.println("Verilen sayinin birler basamagi: " + sayi % 10);

        // verilen sayının birler basamağı hariç geri kalanını yazdırın.

        System.out.println(sayi/10); // 146
        System.out.println(sayi); //1469

        System.out.println(sayi/=10); //146
        System.out.println(sayi); //146

        // sayi/10 ile sayi/=10 arasındaki fark nedir?
        // = işareti atama (assignment) demektir. bu işaret varsa değer kalıcı olarak değişir.
        // = işareti yoksa matematiksel işlem yapar, sayıya yeni bir atama yapmaz.
        // işlemin sonucu yazdırılır ama sayi/10 yazilirsa sayinin değeri değişmez
        // sayi/=10 şeklinde yazılırsa sayi 10'a bölünerek yazdırılır ve sayi değeri kalıcı olara kdeğişir.





    }
}
