package day03;

public class C7_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int num = 20 ;

        System.out.println(num++); // sonuç 21 olmadı

        System.out.println(num++); // 21 yazdırdı   Bu satırda num değeri 1 artırılıyor ama
                                    // bundan sonraki satırlar için geçerli.
                                    // önce yazdırıyor sonra artırıyor diyebiliriz.
                                    // bu nedenle bundan sonra num değeri 22

        System.out.println(num); // 22 yazdırdı

        System.out.println(++num); // 23 yazdırdı, çünkü önce artır sonra yazdır komutu verdik.
                                    // bu satırdan itibaren geçerli olmak üzere 1 artırdı

        System.out.println(num);

        // ++num dediğimizde PreIncrement olur, önce artırır sonra işlemi yapar.
        // num++ dediğimizde PostIncremenet olur, önce işlem yapar sonra artırır.





    }
}
