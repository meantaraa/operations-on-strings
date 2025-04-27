import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            
            if(mapST.containsKey(chS)){
                if(mapST.get(chS) != chT){
                    return false;
                }else{
                    mapST.put(chS, chT);
                }
            }

            if(mapTS.containsKey(chT)){
                if(mapST.get(chT) != chS){
                    return false;
                }else{
                    mapTS.put(chT, chS);
                }
            }
        }
      return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s = sc.nextLine();

        System.out.println("Enter second string: ");
        String t = sc.nextLine();

        if (isIsomorphic(s, t)) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }

        sc.close();
    }
}
/*
 Time Complexity: O(n)
 Space Complexity: O(n)
 */