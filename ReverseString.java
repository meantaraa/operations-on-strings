/* import java.util.*;

public class ReverseString{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();

        System.out.println("The reversed string is: " + reverseString(s));

    }

    public static String reverseString(String s){

        String rev = "";

        for(int i = s.length()-1; i>=0; i--){
            rev = rev+ s.charAt(i);
        }

        return rev;
    }
}

*/


import java.util.*;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();

        reverseString(s);

    }

    public static void reverseString(String s){

        StringBuilder sb = new StringBuilder(s);
        String result = sb.reverse().toString();

        System.out.println("The reversed string is: " + result);
    }
    
}
