class Solution {
    void nextPermutation(int[] arr) {
        int ind = -1;
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i+1] > arr[i]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(arr, 0, arr.length-1);
            return;
        }
        for(int j = arr.length-1; j > ind; j--){
            if(arr[j] > arr[ind]){
                int temp = arr[j];
                arr[j] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        reverse(arr, ind+1, arr.length-1);
    }
    
    void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}