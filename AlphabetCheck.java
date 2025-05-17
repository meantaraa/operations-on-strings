import java.util.Scanner;

public class AlphabetCheck {

    public static void isAlphabet(char ch) {
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet.");
        } else {
            System.out.println("Not an alphabet.");
        }

        /*
         * if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
         * System.out.println("Alphabet.");
         * } else {
         * System.out.println("Not an alphabet.");
         * }
         */

        /*
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        isAlphabet(ch);

        sc.close();
    }
}

/*
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
