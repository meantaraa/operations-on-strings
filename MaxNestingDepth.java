import java.util.Scanner;

class MaxNestingDepth {
    public static int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the parentheses string: ");
        String s = scanner.nextLine();

        int result = maxDepth(s);
        System.out.println("The maximum nesting depth is: " + result);

        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
