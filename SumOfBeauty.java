import java.util.Scanner;

public class SumOfBeauty {

    public static int sumOfBeauty(String s) {
        int n = s.length();
        int totalBeauty = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxFreq = 0;
            int minFreq = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                maxFreq = Math.max(maxFreq, freq[ch - 'a']);
                minFreq = Integer.MAX_VALUE;

                for (int k = 0; k <= 26; k++) {
                    if (freq[k] > 0) {
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int result = sumOfBeauty(s);
        System.out.println("Sum of beauty of all substrings: " + result);

        scanner.close();
    }
}
/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */