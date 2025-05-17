import java.util.*;

class SortByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(freqMap.keySet());

        characters.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

        StringBuilder sb = new StringBuilder();
        for (char c : characters) {
            int freq = freqMap.get(c);
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = frequencySort(input);
        System.out.println("Sorted string based on frequency: " + result);

        scanner.close();

    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */