import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        /*
         *
         * Kullanıcıdan boy değerini iste.
         *
         * Kullanıcıdan kilo değerini iste.
         *
         * Vücut kitle endeksini hesapla = Kilo (kg) / Boy (m) * Boy (m)
         *
         * */
        Scanner input = new Scanner(System.in);
        double lengt, weight, index;
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        lengt = input.nextDouble();
        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        weight = input.nextDouble();
        index = weight / (lengt * lengt);
        System.out.println("Vucüt Kitle Endeksiniz: " + index);
    }
}
