import java.util.Scanner;

class CountSubstrings {
    public static int countSubstrings(String s) {
        int n = s.length();
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        
        int result = countSubstrings(s);
        
        System.out.println("Total number of substrings: " + result);

        scanner.close();
    }
}
/*
 Time Complexity: O(n)
 Space Complexity: O(n)
 */