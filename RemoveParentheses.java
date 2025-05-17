import java.util.Scanner;

public class RemoveParentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (count > 0) {
                    result.append(ch);
                }
                count++;
            } else if (ch == ')') {
                count--;
                if (count > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of parentheses:");
        String input = scanner.nextLine();

        String output = removeOuterParentheses(input);
        System.out.println("Result after removing outer parentheses: " + output);

        scanner.close();
    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */