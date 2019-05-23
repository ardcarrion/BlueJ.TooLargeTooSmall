
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main
{
    private int guessedNumber;
    private int lastGuess;
    private int correctNumber;
    private boolean won;
            
    public static void main(String[] args) 
    {
        
        double mysteryNumber = 100*Math.random();
        int correctNumber = (int)Math.floor(mysteryNumber);
        System.out.println("Guess the mystery number between 0 and 100");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();
        int lastGuess = guess;
        int totalGuesses = 1;
        
        boolean firstMove = true;
        while (guess != correctNumber) {
          if (!firstMove && guess == lastGuess) {
              System.out.println();
          } else { 
              firstMove = false;
              
              if (guess < correctNumber) {
                    System.out.println("Whoops, that's too small!");         
              } else {
                    System.out.println("Whoops, that's too big!");
              }
              System.out.println("Try again please: ");
          }

          lastGuess = guess;
          guess = in.nextInt();
          totalGuesses++;
        }
            
        System.out.println("Congratulations! That's the right number!");
        System.out.printf("It took you %d guesses.\n", totalGuesses);

    }

    /**
     * Start playing the TooLargeTooSmall game
     */
    
    private void startGame()
    {
        // put your code here
        return;
    }
    
}
