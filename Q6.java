import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Q6 {

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
      
        List<int[]> result = new ArrayList<>();
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        
        int cumulativeSum = 0;
        
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);
        
        for (int i = 0; i < arr.length; i++) {
            
            cumulativeSum += arr[i];
            
            if (map.containsKey(cumulativeSum)) {
                
                List<Integer> indices = map.get(cumulativeSum);
                
                
                for (int startIndex : indices) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }
            
            
            map.putIfAbsent(cumulativeSum, new ArrayList<>());
            map.get(cumulativeSum).add(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2}; 
        
        
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        
       
        for (int[] subarray : subarrays) {
            System.out.println("Subarray with zero sum found from index " + subarray[0] + " to " + subarray[1]);
        }
    }
}

    

