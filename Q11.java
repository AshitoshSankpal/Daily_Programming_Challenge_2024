import java.util.*;

   

public class Q11 {

    
    public static List<String> Q11(String s) {
        
        Set<String> uniquePerms = new HashSet<>();
        
        
        char[] characters = s.toCharArray();
        
       
        permute(characters, 0, uniquePerms);
        
        
        List<String> result = new ArrayList<>(uniquePerms);
        Collections.sort(result);
        return result;
    }

    
    private static void permute(char[] chars, int index, Set<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }

        
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1, result);
            swap(chars, index, i); 
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> permutations = Q11(s);
        System.out.println(permutations);
    }
}

