import java.util.Scanner;

public class LightningDistanceCalculator {
    public static void main(String[] args) {
        // Set the speed of sound in air in meters per second
        double speedOfSound = 343.2;

        // Set the constant time interval between flash and clap in seconds
        double timeInterval = 3.0;

        // Get the time interval in seconds from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Interval: ");
        double seconds = scanner.nextDouble();

        // Calculate the distance to the lightning strike in meters
        double distance = speedOfSound * (seconds / timeInterval);

        // Print the distance to the lightning strike in meters
        System.out.printf("The distance to the lightning strike is %.2f meters", distance);
    
        scanner.close();

    }
}
