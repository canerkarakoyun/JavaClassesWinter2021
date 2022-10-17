package day10_SwitchCase;

public class C7_StringManipulation1 {
    public static void main(String[] args) {
        // manipulation=donusturme, degistirme
        // String Manipulation = String Degistirme
        // String non-primitive bir data tipidir.
        // methodları kullanarak

        String str="Hello World";

        System.out.println(str.toUpperCase()); // HELLO WORLD yazdirir

        System.out.println(str); // Hello World yazdırır. Cunku bir atama yapmadik, metot kullanarak tek seferlik
                                  // degisiklik yaptik.

        String str2=str.toUpperCase();

        System.out.println(str); // Hello World
    }
}
