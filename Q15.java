import java.util.HashSet;
public class Q15 {
  


    public static int lengthOfLongestSubstring(String s) {
        int start = 0, maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start));
                start++;
            }
            charSet.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));  
    }
}

    

