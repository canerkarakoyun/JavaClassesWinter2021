package day03;

public class C3_DataCasting {

    public static void main(String[] args) {
        // byte veri türünde bir değişken oluşturup değer atayın
        // oluşturulan variable'ı adım adım AUTO WIDINING ile genişletip yazsırın

        byte numByte=45;

        System.out.println("byte değişken değeri: " + numByte);

        short numShort=numByte;  // short, byte'dan büyük olduğundan java şikayet etmiyor

        System.out.println("short değişken değeri: " + numShort);

        int numInt=numShort;

        System.out.println("int değişken değeri: " + numInt);

        float numFloat=numInt;

        System.out.println("float değişken değeri: " + numFloat);

        double numDouble=numFloat;

        System.out.println("double değişken değeri: " + numDouble);



    }
}
