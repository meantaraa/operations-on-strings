/* import java.util.*;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();

        if(isPalindrome(s)){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not palindrome.");
        } 
    }

    public static boolean isPalindrome(String s){

        String reversed = "";

        for(int i = s.length()-1; i>=0; i--){
            reversed += s.charAt(i);
        }

        return s.equals(reversed);
    }
    
}

*/

/* import java.util.*;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter a String: ");
        String s = sc.next();

        if(isPalindrome(s)){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not Palindrome.");
        }

    }

    public static boolean isPalindrome(String s){

        StringBuilder sb = new StringBuilder(s);
        String result = sb.reverse().toString();

        return s.equalsIgnoreCase(result);

    }
}

*/

import java.util.*;

public class CheckPalindrome{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter a String: ");
        String s = sc.next();

        if(isPalindrome(s)){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not Palindrome.");
        }

    }
    public static boolean isPalindrome(String s){

        int start = 0;
        int end = s.length()-1;

        while(start < end){

            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }
    
    return true;

    }
}
