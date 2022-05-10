# Guess The Number Game in Java
## Youtube Video
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/nToytjpHB3o/0.jpg)](https://www.youtube.com/watch?v=nToytjpHB3o)

## java and javac version
```console
foo@bar:~$ java -version
java version "1.8.0_311"
Java(TM) SE Runtime Environment (build 1.8.0_311-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.311-b11, mixed mode)
```
```console
foo@bar:~$ javac --version
javac 15.0.2
```
Content of the `GuessTheNumber.java` file:
```java
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
```
