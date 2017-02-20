import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList<String> wordBank = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        wordBank.add("pajamas");
        wordBank.add("gimmick");
        wordBank.add("emblaze");
        wordBank.add("oblique");

        Integer rand = random.nextInt(wordBank.size());
        String secretWord = wordBank.get(rand);
        Integer secretWordLength = secretWord.length();
        char[] newWord = "_______".toCharArray();


        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the letters contained in the secret 7 letter word. You get 5 guesses.");

        Integer guessesAllowed = 5;
        Integer guessesMade = 0;
        Integer correctLetters = 0;

        while(guessesMade < guessesAllowed && correctLetters < secretWordLength) {
            System.out.println(newWord);
            System.out.println("Enter letter:");
            String userGuess = scanner.nextLine();
            char[] guess = userGuess.toCharArray();

            if (secretWord.contains(userGuess)) {
                for (int i = 0; i < secretWordLength; i++) {
                    if (secretWord.substring(i, i + 1).contentEquals(userGuess)) {
                        newWord[i] = guess[0];
                        correctLetters++;
                    }
                }
                if(correctLetters < secretWordLength) {
                    System.out.println("Good guess. " + (guessesAllowed - guessesMade) + " guess[es] remaining.");
                }
            } else {
                guessesMade++;
                System.out.println("Bad guess. " + (guessesAllowed - guessesMade) + " guess[es] remaining.");
            }
        }

        if(guessesMade == guessesAllowed){
            System.out.println("Sorry, out of guesses. The word was " + secretWord + ".");
        }
        else if(correctLetters == secretWordLength){
            System.out.println("Great job, you guessed the secret word! It was " + secretWord + ".");
        }

    }
}
