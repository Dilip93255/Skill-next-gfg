import java.util.*;

class Solution {
    int countNumbers(int n) {
        int limit = (int)Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[limit];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) primes.add(i);
        }

        int count = 0;
        for (int p : primes) {
            long num = 1;
            for (int i = 0; i < 8; i++) num *= p;
            if (num <= n) count++;
            else break;
        }
        int size = primes.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                long num = (long)primes.get(i) * primes.get(j);
                num = num * num;
                if (num <= n) count++;
                else break;
            }
        }
        return count;
    }
}
