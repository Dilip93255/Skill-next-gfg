class Solution {
    public static int balanceSums(int[][] mat) {
        int n = mat.length;
        int[] rowSums = new int[n];
        int[] colSums = new int[n];
        int totalSum = 0;

        // Calculate row sums, column sums, and total sum in one pass
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = mat[i][j];
                rowSums[i] += val;
                colSums[j] += val;
                totalSum += val;
            }
        }

        // Find the maximum sum among all rows and columns
        int maxSum = 0;
        for (int k = 0; k < n; k++) {
            maxSum = Math.max(maxSum, rowSums[k]);
            maxSum = Math.max(maxSum, colSums[k]);
        }

        // Total number of operations needed
        return (maxSum * n) - totalSum;
    }
}
