import java.util.*;

public class Alphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);

       if(checkAlphabet(c)){
        System.out.println("It's an alphabet.");
       }else{
        System.out.println("It's not an alphabet.");
       }

    }

    public static boolean checkAlphabet(char ch){

        return Character.isLetter(ch);

    }
}
