import java.util.*;

class Solution {
    public List<Integer> findMajority(int[] arr) {
        int n = arr.length;
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;

        // First pass: find potential candidates
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass: confirm the candidates
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        Collections.sort(result); // sort in increasing order
        return result;
    }
}
