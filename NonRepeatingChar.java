import java.util.*;

public class NonRepeatingChar {

    public static void nonRepeatingChar(String str) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Non repeating characters: ");
        for (char ch : str.toCharArray()) {
            if (freqMap.get(ch) == 1) {
                System.out.println(ch + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        nonRepeatingChar(input);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
