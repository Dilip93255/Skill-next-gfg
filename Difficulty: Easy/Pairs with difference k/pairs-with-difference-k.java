import java.util.*;
class Solution {
    int countPairs(int[] arr, int k) {
        int n = arr.length;
        int cnt = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(arr[i] + k)) {
                cnt += freq.get(arr[i] + k);
            }
            if (freq.containsKey(arr[i] - k)) {
                cnt += freq.get(arr[i] - k);
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