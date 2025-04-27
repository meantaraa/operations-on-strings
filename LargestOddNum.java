import java.util.*;

public class LargestOddNum {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        String num = sc.nextLine();
        System.out.println("Largest odd number: " + largestOddNumber(num));
    }
}
/*
 Time Complexity: O(n)
 Space Complexity: O(1)
 */