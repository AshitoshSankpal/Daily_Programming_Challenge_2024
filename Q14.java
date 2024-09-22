import java.util.HashMap;
public class Q14 {
    

    
    
        
        public static int countAtMostKDistinct(String s, int k) {
            int n = s.length();
            HashMap<Character, Integer> freqMap = new HashMap<>();
            int left = 0, count = 0;
    
            for (int right = 0; right < n; right++) {
              
                char rightChar = s.charAt(right);
                freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
    
               
                while (freqMap.size() > k) {
                    char leftChar = s.charAt(left);
                    freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                    if (freqMap.get(leftChar) == 0) {
                        freqMap.remove(leftChar);
                    }
                    left++;
                }
    
               
                count += right - left + 1;
            }
    
            return count;
        }
    
        
        public static int countSubstringsWithExactlyKDistinct(String s, int k) {
            return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k - 1);
        }
    
        
        public static void main(String[] args) {
            String s = "pqpqs";
            int k = 2;
            int result = countSubstringsWithExactlyKDistinct(s, k);
            System.out.println(result); 
        }
    }
    

