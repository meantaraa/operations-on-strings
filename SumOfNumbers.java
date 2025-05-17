import java.util.*;

public class SumOfNumbers {
    public static int sumOfNumbers(String str) {

        /*
         * int sum = 0;
         * for(int i = 0; i<= str.length(); i++){
         * char ch = str.charAt(i);
         * 
         * if(ch >= '0' && ch <= '9'){
         * sum += (ch - '0');
         * }
         * }
         * return sum;
         */

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing digits: ");
        String input = scanner.nextLine();

        int result = sumOfNumbers(input);
        System.out.println("The sum of digits in the string is: " + result);

        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */