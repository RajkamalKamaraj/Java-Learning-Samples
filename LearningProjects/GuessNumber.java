package LearningProjects;
/*
   A simple Number Guessing Game in Java. practice with if, while, and user input handling.
   Here we are using Random class. Random class available in util header file.
 */
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int guessNumber = rand.nextInt(100)+1;
        int userGuess = 0;
        int count = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (userGuess != guessNumber){
           System.out.print("Enter your guess: ");
           userGuess = sc.nextInt();
           count++;

            if (userGuess < guessNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > guessNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + count + " attempts.");
            }
        }
    }
}
