package day01_veriables;

public class C4_Veriables3 {

    public static void main (String [] args) {

        String isim1="Java";
        String isim2="Güzel";

        System.out.println(isim1 + " " + isim2);

        int sayi1=5;
        int sayi2=7;

        System.out.println(sayi1+sayi2+isim1); // 12Java, önce int geldiğinden matematiksel işlem yaptı
        System.out.println(isim1+sayi1+sayi2); // Java57, önce String geldiğinden sonrasını da dizine ekledi, matematiksel işlem yapmadı



    }
}
