import java.util.*;

public class LargestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] strs = new String[n];
        System.out.println("Enter the strings one by one:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }

        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
/*
 Time Complexity: O(n)
 Space Complexity: O(1)
 */