import java.util.Scanner;

public class RemoveSpaces {

    public static String removeSpaces(String str) {
        /*
         * StringBuilder sb = new StringBuilder();
         * 
         * for (char ch : str.toCharArray()) {
         * if (ch != ' ') {
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
        return str.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeSpaces(input);
        System.out.println("String without spaces: " + result);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
