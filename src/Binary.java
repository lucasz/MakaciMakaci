/**
 * Binary
 */
public class Binary {

    public static void main(String[] args) {
        binarne();
    };

    public static void binarne() {
 
        int i = 123;
        int y = 1588;
        
        System.out.println("vysledok v binarnom kode: " + Integer.toBinaryString(i & y));
        System.out.println("vysledok v binarnom kode posunuty: " + Integer.toBinaryString(i >> 24));
        System.out.println("vysledok v binarnom kode alebo: " + Integer.toBinaryString(i ^ y));

    };

    public static void second() {
        
        int a = 2;
        int b = 4;

        System.out.println(a >= b);
        System.out.println(a <= b);

    };
};