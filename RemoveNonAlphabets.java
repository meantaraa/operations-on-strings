import java.util.Scanner;

public class RemoveNonAlphabets {

    public static String removeNonAlphabets(String str) {

        /*
         * StringBuilder sb = new StringBuilder();
         * 
         * for (int i = 0; i < str.length(); i++) {
         * char ch = str.charAt(i);
         * if (Character.isLetter(ch)) {
         * sb.append(ch);
         * }
         * }
         * 
         * return sb.toString();
         */

        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeNonAlphabets(input);
        System.out.println("String with only alphabets: " + result);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
