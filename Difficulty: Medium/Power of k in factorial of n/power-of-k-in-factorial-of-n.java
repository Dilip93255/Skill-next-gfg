class Solution {
    public int maxKPower(int n, int k) {
        // code here
        Map<Integer, Integer> factors = primeFactors(k);
        int minX = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
            int prime = entry.getKey();
            int countInK = entry.getValue();
            int countInNFact = exponentInFactorial(n, prime);
            minX = Math.min(minX, countInNFact / countInK);
        }
        return minX;
    }

    private static Map<Integer, Integer> primeFactors(int k) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i * i <= k; i++) {
            while (k % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                k /= i;
            }
        }
        if (k > 1) {
            factors.put(k, factors.getOrDefault(k, 0) + 1);
        }
        return factors;
    }

    private static int exponentInFactorial(int n, int p) {
        int count = 0;
        while (n > 0) {
            n /= p;
            count += n;
        }
        return count;
    }
}