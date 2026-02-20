import java.util.*;
class Solution {
    public boolean findTriplets(int[] arr) {
        // YOur code here
        int n = arr.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int val = -(arr[j] + arr[k]);
                if (map.containsKey(val)) {
                    return true;
                }
            }
            if (!map.containsKey(arr[j])) {
                map.put(arr[j], new ArrayList<>());
            }
            map.get(arr[j]).add(j);
        }
        return false;
    }
}