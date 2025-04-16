/* import java.util.Scanner;

public class CapitalizeFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String result = capitalizeFirstLast(input);
        System.out.println(result);
        sc.close();
    }

    public static String capitalizeFirstLast(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }

            if (i == n - 1 || chars[i + 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }
}
*/

import java.util.Scanner;

public class CapitalizeFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = capitalizeFirstLast(input);
        System.out.println(result);
        sc.close();
    }

    public static String capitalizeFirstLast(String s) {
        StringBuilder result = new StringBuilder(s);
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (i == 0 || s.charAt(i - 1) == ' ') {
                result.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }

            if (i == n - 1 || s.charAt(i + 1) == ' ') {
                result.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
        }

        return result.toString();
    }
}




