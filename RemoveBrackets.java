/* import java.util.*;

public class RemoveBrackets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("The string after removing brackets: " + removeBrackets(s));

        sc.close();

    }

    public static String removeBrackets(String s){
        return s.replaceAll("[{}()\\[\\]]", "");
    }

}
*/

import java.util.*;

public class RemoveBrackets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("The string after removing brackets: " + removeBrackets(s));

        sc.close();

    }

    public static String removeBrackets(String s){

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<=s.length()-1; i++) {
            char ch = s.charAt(i);

            if(ch != '[' && ch != ']' && ch != '{' && ch != '}' && ch != '(' && ch != ')'){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}