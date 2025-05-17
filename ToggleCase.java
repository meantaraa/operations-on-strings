import java.util.*;

public class ToggleCase{
    public static String toggleCase(String str){

        StringBuilder toggled = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                toggled.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                toggled.append(Character.toUpperCase(ch));
            }else{
                toggled.append(ch);
            }
        }

        return toggled.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggledString = toggleCase(input);
        System.out.println("Toggled string: " + toggledString);

        sc.close();
    }
}

/*
 Time Complexity: O(n)
 Space Complexity: O(n)
*/