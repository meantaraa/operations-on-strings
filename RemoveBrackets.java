import java.util.Scanner;

public class RemoveBrackets {

    public static String removeBrackets(String expr) {

        /*
         * *
         * StringBuilder sb = new StringBuilder();
         * 
         * for (char ch : expr.toCharArray()) {
         * if (ch != '(' && ch != ')') {
         * sb.append(ch);
         * }
         * }
         * 
         * return sb.toString();
         */

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(n)
         */

         return expr.replaceAll("[(){}\\[\\]]", "");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an algebraic expression: ");
        String input = sc.nextLine();

        String result = removeBrackets(input);
        System.out.println("Expression without brackets: " + result);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
