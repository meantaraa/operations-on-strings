import java.util.Scanner;

public class ReverseWords {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0)
                reversed.append(" ");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence to reverse its words: ");
        String input = sc.nextLine();
        String result = reverseWords(input);
        System.out.println("Reversed sentence: " + result);

        sc.close();

    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */