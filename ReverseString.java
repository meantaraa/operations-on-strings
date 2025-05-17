import java.util.Scanner;

public class ReverseString {

    public static void printReverse(String str) {

        /*
         * StringBuilder sb = new StringBuilder(str);
         * sb.reverse();
         * System.out.println(sb.toString());
         */

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        printReverse(input);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
