// Guess Number by Mihir Kolli

import java.util.Scanner;
public class GuessNumber
{
    public static void main (String[] args)
    {
        boolean won = false;
        // Declares if game is won
        Scanner in = new Scanner(System.in);
        System.out.println("How high shall we play to?");
        int max = in.nextInt();
        // Gets the range from the player
        int min = 0;
        // sets a minimum for AI calculations later
        int result = 0;
        // decides if guess is too high, low, or is correct
        int answer = (int)(Math.random()*max+1);
        // finds a random answer in the range
        int previous = (int)(max / 2);
        // initializes a first move as the halfway point of the range
        ComputerPlayer computer = new ComputerPlayer();
        System.out.println("I'm thinking of a number between 1 and " + max + ".");
        // plays game untill AI guesses correctly, minimum number of moves
        while(won == false)
        {
            int guess = computer.play(result, previous, max, min);
            // takes int from computer AI
            // Figures out of guess is too high or too low
            if (guess < answer)
            {
                result = -1;
                previous = guess;
                if (guess > min) min = previous;
                // If guess is too low, sets min accordingly
            }
            else if (guess > answer)
            {
                result = 1;
                previous = guess;
                if (guess < max) max = previous;
                // IF guess is too high, sets max accordingly
            }
            else won = true;
            // if the guess is correct, exits the loop

            System.out.println(guess);
            // prints the computer's guess for us to see
        }
        System.out.println("GG!");
        // Game is complete
    }
}
