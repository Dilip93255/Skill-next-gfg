class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        int[][] matrix = new int[n][m];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        int index = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = arr[index++];
            }
            top++; 
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = arr[index++];
            }
            right--; 
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = arr[index++];
                }
                bottom--; 
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = arr[index++];
                }
                left++; 
            }
        }
        return matrix;
    }
}