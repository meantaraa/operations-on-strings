import java.util.*;

public class NonRepeatingChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        printNonRepeating(input);
    }

    public static void printNonRepeating(String s) {

        s = s.toLowerCase();
        
        int[] freq = new int[256]; 

      
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        System.out.println("Non-repeating characters:");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}
