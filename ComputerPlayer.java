public class ComputerPlayer
{
    public int play(int result, int previous, int max, int min)
    {
    // Tell AI Player what result was of last guess

    if (result == 0)
    {
        System.out.println("What's your guess?");
        return ((int)(max / 2));
        // Guess half way point of range at begining of game
    }
    else if (result == -1)
    {
        System.out.println("Too Low, Whats your guess?");
        int SmartGuess = (int)(previous + (((max + 1) - previous)/2));
        return SmartGuess;
        // If too low, guess halfway between maximum possible value and current value
    }
    else
    {
        System.out.println("Too High, Whats your guess?");
        int SmartGuess = (int)(((max - min)/2) + min);
        return SmartGuess;
        // If too high, guess halfway between minimum possible value and current value
    }
    }
}
