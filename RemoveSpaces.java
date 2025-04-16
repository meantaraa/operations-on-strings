/* import java.util.*;

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String result = sc.nextLine(); //reads entire line

        System.out.println(removeSpaces(result));

    }

    public static String removeSpaces(String s){

        return s.replaceAll("\\s+", "");
    }
    
}
*/

import java.util.*;

public class RemoveSpaces{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("The string without spaces: " + removeSpaces(s));

    }

    public static String removeSpaces(String s) {

      StringBuilder sb = new StringBuilder();

      for(int i=0; i<=s.length()-1; i++)

      if(s.charAt(i) != ' '){
        sb.append(s.charAt(i));
      }

      return sb.toString();
  
    }
     
}


