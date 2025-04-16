// import java.util.*;

// public class ToggleString {
    
//     public static void main(String[] args) {
    

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String s = sc.next();

//         String toggledString = toggleStringCae(s);
        
//         System.out.println( "The toggled string is: "+ toggledString);

//     }

//     public static String toggleStringCae(String s){

//         String result = "";

//         for(int i=0; i<=s.length()-1; i++){
//            if(Character.isLowerCase(s.charAt(i))){
//             result = result + Character.toUpperCase(s.charAt(i));
//            }else{
//             result = result + Character.toLowerCase(s.charAt(i));
//            }
//         }

//         return result;
//     }
// }

import java.util.*;

public class ToggleString {
    
    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();

        String toggledString = toggleStringCae(s);
        
        System.out.println( "The toggled string is: "+ toggledString);

    }

    public static String toggleStringCae(String s){

        StringBuilder result = new StringBuilder();

        for(int i=0; i<=s.length()-1; i++){
            if(Character.isUpperCase(s.charAt(i))){
                result.append(Character.toLowerCase(s.charAt(i)));
            }else{
                result.append(Character.toUpperCase(s.charAt(i))); 
            }
        }

        return result.toString();
    }
}
