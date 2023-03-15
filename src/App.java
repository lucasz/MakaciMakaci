
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("cislo"); 
        int a = scanner.nextInt();  
        // System.out.println("cislo");
        int b = scanner.nextInt();
        // System.out.println("cislo");^
        int c = scanner.nextInt();
        // boolean isInt = scanner.hasNextInt();  
        // System.out.println(isInt);
        System.out.println((a * 100) + (b * 10) + (c * 1));

        System.out.println("nech sa paci " + (a + b + c) + " nieco som sa naucil");
        scanner.close();

        int x = 502;
        int y = 203;
        double division = (double) x / y;
        System.out.println("delenenie " + division);

        int reminder = x % y;
        System.out.println("skuska po deleni " + reminder);

        double squareRoot = Math.sqrt((double) x);
        System.out.print("druha odmocnina " + squareRoot);

        int n = 666;
        int n1 = n % 10;
        int n2 = (n / 10) % 18;
        int n3 = 10 * ( n2 / 100);

        System.out.println("zatial stiham takze uvidim " + (n + n1 + n2 + n3) + n1 + n2 + n3);

        double number = 25.0;
        double squareRoot2 = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot2);

        System.out.println("kolko dni ma rok" + 365);
        System.out.println("kolko mesiacov ma rok" + 12);
        System.out.println("nejaky vysledok nieco" + (double) + 365 / 12 / 24 * 60 * 60);

        LocalDateTime currentPremenna = LocalDateTime.now();

        System.out.println("cas" + currentPremenna);

  

    }
}