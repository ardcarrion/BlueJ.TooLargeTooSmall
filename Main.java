
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main
{
    // instance variables - replace the example below with your own
    private int guessedNumber;
    private int lastGuess;
    private int correctNumber;
    private boolean won;
            
    /**
     * Constructor for obects of class Main 
     */
    public Main(int guess) 
    {
       ;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Guess the mystery number!");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();
        int lastGuess = guess;
        int correctNumber = 42;
        //boolean firstMove = true;
        while (guess != correctNumber) {
          if (guess < correctNumber) {
                System.out.println("Whoops, that's too small!");         
          } else {
                System.out.println("Whoops, that's too big!");
          }
          System.out.println("Try again please: ");
          lastGuess = guess;
          guess = in.nextInt();
        }
            
        System.out.println("Congratulations! That's the right number!");

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
