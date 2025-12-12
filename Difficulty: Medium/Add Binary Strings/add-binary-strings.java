// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int n1 = s1.length(), n2 = s2.length();
        
        String ans = "";
        
        int i=n1-1, j=n2-1, rem=0;
        
        while(i>=0 && j>=0){
            int f = s1.charAt(i--)-'0';
            int s = s2.charAt(j--)-'0';
            
            int sum = f+s+rem;
            rem = sum%2;
            int q = sum/2;
            
            ans= rem+ans;
            
            rem = q;
        }
        
        while(i>=0){
             int f = s1.charAt(i--)-'0';
        
            
            int sum = f+rem;
            rem = sum%2;
            int q = sum/2;
            
            ans= rem+ans;
            
            rem = q;
        }
        
        while(j>=0){
        
            int s = s2.charAt(j--)-'0';
            
            int sum = s+rem;
            rem = sum%2;
            int q = sum/2;
            
            ans= rem+ans;
            
            rem = q;
        }
        
        if(rem ==1) ans = rem+ans;
        
        i=0;
        while(i<ans.length()){
            if(ans.charAt(i)=='1') break;
            
            i++;
        }
        
        return ans.substring(i);


    }
}