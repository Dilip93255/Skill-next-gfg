import java.util.*;
class Solution {
    public static int maxDistance(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();  
        int res = 0;                                    
        int n = arr.length;                           
        for (int i = 0; i < n; i++) {                  
            if (!mp.containsKey(arr[i])) {               
                mp.put(arr[i], i);                       
            } 
            else {
                int distance = i - mp.get(arr[i]);        
                res = Math.max(res, distance);          
            }
        }
        return res;                                       
    }
}