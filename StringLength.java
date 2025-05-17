import java.util.*;

public class StringLength {

    public static int stringLength(String str) {

        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int length = stringLength(input);
        System.out.println("Length of the string is: " + length);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */