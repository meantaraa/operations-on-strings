import java.util.*;

public class StringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string: ");
        String s = sc.nextLine();

        int length = getStringLength(s);

        System.out.println("The length is: " + length);

        sc.close();
    }

    public static int getStringLength(String s) {
        int length = 0;
        for (char c : s.toCharArray()) {
            length++;
        }
        return length;
    }
}
