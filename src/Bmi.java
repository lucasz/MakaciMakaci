import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {

        // inicializacia scanneru ktory bere to co napisem
        Scanner scanner = new Scanner(System.in);
        
        // prva otazka
        System.out.println("Vasa vaha v KG je: ");
        // vaha
        double weight = scanner.nextInt();

        // druha otazka
        System.out.println("Vasa vyska v M je: ");
        // vyska
        double height = scanner.nextInt();

        boolean isInt = scanner.hasNextInt();
        System.out.println(isInt);

        double vysledok =  weight / (height * height) * 10000;

        // vysledok
        System.out.println(vysledok + " je vase BMI :)");

        scanner.close();
    }
}
