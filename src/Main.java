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

        Integer rand = random.nextInt(4);
        String secretWord = wordBank.get(rand);
        char[] newWord = "_______".toCharArray();

        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the letters contained in the secret 7 letter word. You get 5 guesses.");

        Integer guessesMade = 0;
        Integer correctLetters = 0;

        while(guessesMade < 5 && correctLetters < 7) {
            System.out.println(newWord);
            System.out.println("Enter letter:");
            String userGuess = scanner.nextLine();
            char[] guess = userGuess.toCharArray();

            if (secretWord.contains(userGuess)) {

                for (int i = 0; i < 7; i++) {
                    if (secretWord.substring(i, i + 1).contentEquals(userGuess)) {
                        newWord[i] = guess[0];
                        correctLetters++;
                    }
                }
                if(correctLetters < 7) {
                    System.out.println("Good guess. " + (5 - guessesMade) + " guess[es] remaining.");
                }

            } else {
                guessesMade++;
                System.out.println("Bad guess. " + (5 - guessesMade) + " guess[es] remaining.");
            }
        }

        if(guessesMade > 4){
            System.out.println("Sorry, out of guesses. The word was " + secretWord + ".");
        }
        else if(correctLetters ==7){
            System.out.println("Great job, you guessed the secret word! It was " + secretWord + ".");
        }

    }
}
