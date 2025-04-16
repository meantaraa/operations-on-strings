/* import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();

        System.out.println("The string after removing vowels is: " + removeVowels(s));

        sc.close();

    }

    public static String removeVowels(String s){
        return s.replaceAll("[aeiou]", "");
    }

}

*/


import java.util.*;

public class RemoveVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        String result = removeVowels(s);

        System.out.println("String without vowels: " + result);

        sc.close();

    }

    public static String removeVowels(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<= s.length()-1; i++){
            char c = s.charAt(i);

            if(!isVowel(Character.toLowerCase(c))){
                sb.append(c);
            }

        }

        return sb.toString();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}