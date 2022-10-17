package day09_ternary;

public class C2_Ternary2 {
    public static void main(String[] args) {

        int y=1;
        int z=1;
        int a= y<10 ? y++ : z++;
        System.out.println(y + "," + z + "," + a);

        // islem icerisinde postincrement olduğundan (y++) önce islemi yapar a değerine 1 atar
        // ardindan bir sonraki satir icin y'nin degerini 1 artirir
        // preincerement (++y) olsaydi, once y'nin degerini 1 artirir, ardından islem yapar a degerine atama yapar





    }
}
