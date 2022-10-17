package day03;

public class C4_DataCastingDaralma {

    public static void main(String[] args) {

        // double bir değişken oluşturalım ve bunu int ve byte'a çevirelim

        double numDouble= 131.56;

        System.out.println("double değişken değeri: " + numDouble);

        int numInt = (int) numDouble;

        // doubledan int'e geçerken eğer ondalıklı bölüm varsa java ondalıklı bölümü yok sayar

        System.out.println("int değişken değeri: " + numInt);

        byte numByte = (byte) numInt;

        System.out.println("byte değişken değeri: " + numByte);

    }
}
