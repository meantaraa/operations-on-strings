import java.util.*;

public class CapitalizeEnds {

    public static String capitalizeEnds(String str) {
        int len = str.length();

        if (len == 0)
            return "";
        if (len == 1)
            return str.toUpperCase();

        char first = Character.toUpperCase(str.charAt(0));

        char last = Character.toUpperCase(str.charAt(len - 1));

        String middle = str.substring(1, len - 1);

        return first + middle + last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = capitalizeEnds(input);
        System.out.println("Output String: " + result);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
