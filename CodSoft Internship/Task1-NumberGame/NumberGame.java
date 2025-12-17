
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int roundsWon = 0;
    char playAgain;
    do {
         int secretNumber = random.nextInt(100) + 1;
         int maxAttempt = 5;
         boolean guessedCorrectly = false;
         System.out.println("Guess a number between 1 and 100");
         System.out.println("You have " + maxAttempt + " attempts");
         for (int attempt = 1; attempt <= maxAttempt; attempt++) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                if (guess == secretNumber) {
                    System.out.println("Correct guess! You found the number in " + attempt + " attempts");
                    roundsWon++;
                    guessedCorrectly = true;
                    break;
                }else if (guess > secretNumber) {
                    System.out.println("Your guess is too high.");
                }else {
                    System.out.println("Your guess is too low.");
                }
                System.out.println("Remaining attempts: " + (maxAttempt - attempt));
            }
            if (!guessedCorrectly) {
                System.out.println("You lost the round. The number was: " + secretNumber);
            }
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');
        System.out.println("Game Over");
        System.out.println("Total rounds won: " + roundsWon);
        scanner.close();
    }
}
