import java.util.Scanner;

public class RotateStringChecker {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubledS = s + s;
        return doubledS.contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String s = sc.nextLine();

        System.out.print("Enter goal string: ");
        String goal = sc.nextLine();

        if (rotateString(s, goal)) {
            System.out.println("The string can be rotated to match the goal.");
        } else {
            System.out.println("The string cannot be rotated to match the goal.");
        }

        sc.close();
    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */