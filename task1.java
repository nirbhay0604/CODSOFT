
import java.util.*;

class NumberGuessingGame {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        Random randomizer = new Random();
        int secretNumber = randomizer.nextInt(100);
        int attempts;
        
        for (attempts = 0; attempts < 10; attempts++) {
            System.out.println("Guess Your Number");
            int playerGuess = scanner.nextInt();
            
            if (secretNumber == playerGuess) {
                System.out.println("Your number matched. You Win!");
                System.out.println("");
                playerScore++;
                break;
            } else if (playerGuess < secretNumber) {
                System.out.println("Your guess is too low. Your number didn't match. You lose.");
                System.out.println("");
                playerScore--;
            } else {
                System.out.println("Your guess is too high. Your number didn't match. You lose.");
                System.out.println("");
                playerScore--;
            }
        }
        
        System.out.println("Number of attempts: " + (attempts + 1)); // Including the successful attempt
        System.out.println("Your Score is " + playerScore);
    }
}
