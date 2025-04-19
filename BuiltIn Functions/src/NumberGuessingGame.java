import java.util.Scanner;

public class NumberGuessingGame {
    public static String getUserFeedback(int guess, Scanner scanner) {
        System.out.println("Is your number " + guess + "? (Enter 'low', 'high', or 'correct')");
        return scanner.nextLine().trim().toLowerCase();
    }
    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2;  // binary search approach
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        System.out.println("Provide feedback after each guess: 'low' if my guess is low, 'high' if it's high, 'correct' if I guessed it.");

        do {
            guess = generateGuess(low, high);
            feedback = getUserFeedback(guess, scanner);

            if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }

        } while (!feedback.equals("correct") && low <= high);

        if (feedback.equals("correct")) {
            System.out.println("Yay! I guessed your number: " + guess);
        } else {
            System.out.println("Hmm... Something went wrong with the feedback!");
        }

        scanner.close();
    }
}
