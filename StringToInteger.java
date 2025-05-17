import java.util.Scanner;

class StringToInteger {
    public static int myAtoi(String s) {
        int i = 0, n = s.length(), result = 0, sign = 1;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert to integer: ");
        String input = scanner.nextLine();

        int result = myAtoi(input);
        System.out.println("Converted integer value: " + result);

        scanner.close();
    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */