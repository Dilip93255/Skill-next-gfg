class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {1, 4, 3, 2, 6, 5};
        solution.reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {4, 5, 2};
        solution.reverseArray(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1};
        solution.reverseArray(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}