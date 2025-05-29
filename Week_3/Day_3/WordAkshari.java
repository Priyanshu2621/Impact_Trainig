import java.util.Scanner;

public class WordAkshari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String previousWord = null;

        while (true) {
            System.out.print("Enter a word: ");
            String currentWord = scanner.nextLine().toLowerCase();
            if (previousWord == null) {
                previousWord = currentWord;
                System.out.println("First word accepted.");
                continue;
            }
            char lastChar = previousWord.charAt(previousWord.length() - 1);
            char firstChar = currentWord.charAt(0);

            if (lastChar == firstChar) {
                System.out.println("Next Word!");
            } else {
                System.out.println("Wrong Word.");
                break;
            }
            previousWord = currentWord;
        }
        scanner.close();
    }
}
