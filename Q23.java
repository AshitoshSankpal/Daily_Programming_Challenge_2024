import java.util.*;

public class Q23 {
    
    public static int[] slidingWindowMax(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return new int[0]; 
        }

       
        List<Integer> result = new ArrayList<>();
        
        
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            
           
            deque.offerLast(i);
            
            
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }
        
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        
        int[] result = slidingWindowMax(arr, k);
        
        System.out.println("Sliding Window Maximum: " + Arrays.toString(result));
    }
}
