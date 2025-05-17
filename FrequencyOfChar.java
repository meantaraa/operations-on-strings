import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfChar {
    /*
     * public static void frequencyOfChar(String str) {
     * int[] freq = new int[str.length()];
     * char[] chars = str.toCharArray();
     * 
     * for (int i = 0; i < str.length(); i++) {
     * freq[i] = 1;
     * for (int j = i + 1; j < str.length(); j++) {
     * if (chars[i] == chars[j]) {
     * freq[i]++;
     * chars[j] = '0'; // mark visited character
     * }
     * }
     * }
     * 
     * System.out.println("Frequency of characters:");
     * for (int i = 0; i < freq.length; i++) {
     * if (chars[i] != ' ' && chars[i] != '0') {
     * System.out.println(chars[i] + " - " + freq[i]);
     * }
     * }
     * 
     */

    /*
     * Time Complexity: O(n^2)
     * Space Complexity: O(n)
     */

    // HashMap Approach
    public static void frequencyOfChar(String str) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch == ' ')
                continue;
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Frequency of characters: ");
        freqMap.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        frequencyOfChar(input);
        System.out.println();

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */
