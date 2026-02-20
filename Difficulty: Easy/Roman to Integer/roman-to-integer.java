class Solution {
    public int romanToDecimal(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int curr = value(s.charAt(i));
            if (i < n - 1 && curr < value(s.charAt(i + 1))) {
                res -= curr;   
            } else {
                res += curr;   
            }
        }
        return res;
    }
    int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }
}