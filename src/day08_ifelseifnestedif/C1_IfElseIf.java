package day08_ifelseifnestedif;

import java.util.Locale;
import java.util.Scanner;

public class C1_IfElseIf {
    public static void main(String[] args) {

        // Kullanıcıdan gün ismini isteyin, Girilen isim geçerli bir gün ise;
        // ismin ilk 3 harfini, ilk harf büyük, diğerleri küçük olarak yazdırın
        // Gün ismi geçerli değilse "Geçerli bir gün ismi giriniz" yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");

        String gunIsmi= scan.nextLine();
        // next() metodu ilk space'e kadar olan kismi, yani ilk kelimeyi alir.
        // nextLine() metodu yazılan tum satiri alir.
        // kullanıcı ne yazdıysa görmek istiyorum. Kullanıcı hatalarını yakalamak istiyorum.
        // Bu yüzden String ve nextLine yaptım

        if (gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Paz");
        }   else if (gunIsmi.equalsIgnoreCase("Sali")) {
            System.out.println("Sal");
        }   else if (gunIsmi.equalsIgnoreCase("Carsamba")) {
            System.out.println("Car");
        }   else if (gunIsmi.equalsIgnoreCase("Persembe")) {
            System.out.println("Per");
        }   else if (gunIsmi.equalsIgnoreCase("Cuma") || gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Cum");
        }   else {
            System.out.println("Lütfen geçerli bir gün ismi giriniz!!!");
        }

            // equals => bunu kullanınca büyük harf küçük harf duyarlı olur
            // equalsIgnoreCase => bunu kullanırsak büyük harfe küçük harfe bakmaz, içeriği ile ilgilenir
            // bu durumda Stringi oluştururken .toLowerCase kullanmamıza gerek kalmaz.
            // equalsIgnoreCase () : metodu iki String'in buyuk, kucuk harf hassasiyeti olmadan
            // esit olup olmadigini karsilastirir.




    }

}
