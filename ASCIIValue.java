import java.util.Scanner;

public class ASCIIValue {

    public static void asciiValue(char ch) {
        if (Character.isLetter(ch)) {
            int ascii = (int) ch;
            System.out.println("ASCII value of '" + ch + "' is: " + ascii);
        } else {
            System.out.println("Input is not an alphabet character.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        asciiValue(ch);

        sc.close();
    }
}

/*
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
