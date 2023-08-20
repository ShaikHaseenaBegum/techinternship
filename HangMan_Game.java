package internsavy_task02;

	import java.util.Scanner;
	public class HangMan_Game {
	    public static void main(String[] args) {
	        String[] words = {"apple", "banana", "cherry", "grape", "orange"};
	        String wordToGuess = words[(int) (Math.random() * words.length)];
	        int maxTries = 6;
	        int tries = 0;

	        char[] guessedWord = new char[wordToGuess.length()];
	        for (int i = 0; i < guessedWord.length; i++) {
	            guessedWord[i] = '_';
	        }

	        Scanner scanner = new Scanner(System.in);

	        while (tries < maxTries && containsUnderscore(guessedWord)) {
	            System.out.println("Guess a letter: ");
	            char guess = scanner.next().charAt(0);

	            boolean correctGuess = false;
	            for (int i = 0; i < wordToGuess.length(); i++) {
	                if (wordToGuess.charAt(i) == guess) {
	                    guessedWord[i] = guess;
	                    correctGuess = true;
	                }
	            }

	            if (!correctGuess) {
	                tries++;
	                System.out.println("Incorrect guess. Tries left: " + (maxTries - tries));
	            }

	            System.out.println("Current progress: " + new String(guessedWord));
	        }

	        if (!containsUnderscore(guessedWord)) {
	            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
	        } else {
	            System.out.println("Out of tries. The word was: " + wordToGuess);
	        }

	        scanner.close();
	    }

	    private static boolean containsUnderscore(char[] array) {
	        for (char c : array) {
	            if (c == '_') {
	                return true;
	            }
	        }
	        return false;
	    }
	}


