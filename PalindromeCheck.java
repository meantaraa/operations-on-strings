import java.util.*;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {

        /*
         * String original = str.toLowerCase();
         * 
         * StringBuilder sb = new StringBuilder(original);
         * 
         * sb.reverse();
         * 
         * String reversed = sb.toString();
         * 
         * return original.equals(reversed);
         */

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(n)
         */

        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }

        sc.close();
    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
