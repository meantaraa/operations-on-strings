// import java.util.*;

// public class RemoveChar {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String: ");
//         String s = sc.next();

//         System.out.println("The string after removing characters except alphabets is: " + removeChar(s));

//         sc.close();

//     }

//     public static String removeChar(String s){
//         return s.replaceAll("[^a-zA-Z]", "");
//     }

// }

import java.util.*;

public class RemoveChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        String result = removeChar(s);

        System.out.println("String after removing all chracters except alphabets: " + result);

        sc.close();

    }

    public static String removeChar(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<= s.length()-1; i++){
            char c = s.charAt(i);

            if(isAlphabet(c)){
                sb.append(c);
            }

        }

        return sb.toString();
    }

    public static boolean isAlphabet (char c) {
        return Character.isLetter(c);
    }
}

