import java.util.*;

public class CountVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine().toLowerCase();

        int sum = 0;


        for(int i=0; i<=s.length()-1; i++){
        if(isVowel(s.charAt(i))){
            sum++;
        }
    }

        System.out.println("The number of vowels is: " + sum);



    }

    public static boolean isVowel(char c){

       return (c == 'a' || c == 'e'  || c == 'i' || c == 'o' || c == 'u');
    }
    
}
