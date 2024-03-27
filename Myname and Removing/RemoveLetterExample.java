package tools;

import java.util.Scanner;

public class RemoveLetterExample {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence or word: ");
        String input = scanner.nextLine();

        char letter = 'a';
        String modified = input.replace(String.valueOf(letter), "");

        System.out.println("Modified string: " + modified);
    }
}
