import java.util.Scanner;

public class VowelOrConsonant{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        checkVowel(ch);

    }

    public static void checkVowel(char ch){

        if(ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u'){
            System.out.println("It's a Vowel.");
        }else if(Character.isLetter(ch)){
            System.out.println("It's a Consonant.");
        }else{
            System.out.println("Enter a valid character.");
        }
    }
}