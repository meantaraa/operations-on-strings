import java.util.*;

public class VowelOrConsonant {

    public static void isVowel(char ch) {

        /*
         * if (Character.isLetter(ch)) {
         * if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
         * System.out.println("Vowel.");
         * } else {
         * System.out.println("Consonant.");
         * }
         * } else {
         * System.out.println("Invalid input.");
         * }
         */

        /*
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         */

        /*
         * switch (ch) {
         * case 'a': case 'e': case 'i': case 'o': case 'u':
         * System.out.println("Vowel");
         * break;
         * default:
         * if (ch >= 'a' && ch <= 'z') {
         * System.out.println("Consonant");
         * } else {
         * System.out.println("Not an alphabet");
         * }
         * }
         */
        /*
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         */

        String vowels = "aeiou";

        if (Character.isLetter(ch)) {
            if (vowels.contains(String.valueOf(ch))) {
                System.out.println("Vowel.");
            } else {
                System.out.println("Consonant.");
            }
        } else {
            System.out.println("Not an alphabet.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        isVowel(ch);

        sc.close();

    }
}
/*
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */