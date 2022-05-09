import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.print("Take a guess: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int guess = scanner.nextInt();
            attempts++;
            if (guess == randomNumber) {
                System.out.println("You guessed it! The number was " + randomNumber);
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            System.out.print("Take a guess again: ");
        }
    }
}