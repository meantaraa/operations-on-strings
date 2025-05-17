import java.util.Scanner;

public class RemoveVowels {

    public static String removeVowels(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String noVowels = removeVowels(input);
        System.out.println("String without vowels: " + noVowels);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
