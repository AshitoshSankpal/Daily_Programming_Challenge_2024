import java.util.HashMap;

public class Q22 {
    public static int firstElementToRepeatKTimes(int[] arr, int k) {
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        
        for (int num : arr) {
            if (frequencyMap.get(num) == k) {
                return num; 
            }
        }
        
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k = 2;
        int result = firstElementToRepeatKTimes(arr, k);
        System.out.println("First element to repeat " + k + " times: " + result);
    }
}
