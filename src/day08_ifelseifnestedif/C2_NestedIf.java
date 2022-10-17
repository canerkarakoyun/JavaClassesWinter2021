package day08_ifelseifnestedif;

public class C2_NestedIf {
    public static void main(String[] args) {

        // Nested : ic ice if

        // Verilen cinsiyet ve yaş için kişinin emekli olup olamayacağını yazdıran bir uygulama yazınız
        // kadınlar 60 yaşından itibaren, erkekler 65 yasindan itibaren emekli olabilir.

        String cinsiyet="erkek";
        int yas=-70;

        if (yas<0){
            System.out.println("yas negatif olamaz");
        }

        if (cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
            System.out.println("Emekli olamazsın");
        } else if (cinsiyet.equalsIgnoreCase("kadin") && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("kadin") && yas<60) {
            System.out.println("Emekli olamazsın");
        } else {
            System.out.println("Cinsiyet ya da yas tanimlanamadi");
        }

        System.out.println("Nested if ile sonuç");

        if (cinsiyet.equalsIgnoreCase("erkek")){

            if (yas<0){
                System.out.println("yas negatif olamaz");
            } else if (yas<65){
                System.out.println("bu yastaki erkek emekli olamaz");
            } else if (yas>=65){
                System.out.println("bu yastaki erkek emekli olabilir");
            }


        }else if (cinsiyet.equalsIgnoreCase("kadin")){

            if (yas<0){
                System.out.println("yas negatif olamaz");
            } else if (yas<60){
                System.out.println("bu yastaki kadin emekli olamaz");
            } else if (yas>=60){
                System.out.println("bu yastaki kadin emekli olabilir");
            }


        }else {
            System.out.println("Girilen cinsiyet bilgisi sistemde tanımlı değil");
        }
    }
}
