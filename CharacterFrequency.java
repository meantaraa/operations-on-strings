import java.util.*;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String input = sc.nextLine(); 
        printFrequency(input);        

        sc.close();
    }

    public static void printFrequency(String s) {

        int[] freq = new int[256]; 
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequencies: ");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}

