import java.util.*;

public class ASCII {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character.");
        char ch = sc.next().charAt(0);

        int asciiValue = getASCIIValue(ch);
        System.out.println("The ASCII value is: " + asciiValue);
        
        sc.close(); 
    }

    public static int getASCIIValue(char ch) {
        return (int) ch; 
    }
}
