import java.util.Scanner;

public class ReplaceSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String original = sc.nextLine();

        System.out.print("Enter the substring to replace: ");
        String toReplace = sc.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = sc.nextLine();

        String result = original.replace(toReplace, replacement);

        System.out.println("Updated string: " + result);
        
        sc.close();
    }
}
