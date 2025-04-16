import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string containing digits: ");
        String s = sc.nextLine();
        
        System.out.println("Sum of all the digits present in the String: " + sumDigits(s));
        
        sc.close();
    }

    public static int sumDigits(String s) {
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += Character.getNumericValue(s.charAt(i));
            }
        }
        
        return sum;
    }
}
