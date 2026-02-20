import java.util.*;
class Solution {
    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (freq.containsKey(complement)) {
                cnt += freq.get(complement);
            }
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }
        return cnt;
    }
}