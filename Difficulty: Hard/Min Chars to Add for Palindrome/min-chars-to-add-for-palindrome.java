class Solution {
    public int minChar(String s) {
        // code here
    String str=s+"#"+new StringBuilder(s).reverse();
    
    int[] lps= new int[str.length()];
    int len=0;
    
    for(int i=1;  i<str.length();){
        if(str.charAt(i)==str.charAt(len))
          lps[i++]=++len;
        else if(len!=0 )
          len=lps[len-1];
        else
           lps[i++]=0;
           
    }
    return s.length() - lps[str.length()-1];
    }
}