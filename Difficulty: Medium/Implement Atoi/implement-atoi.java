class Solution {
    public int myAtoi(String s) {
        // code here
        int idx=0;
        StringBuilder sb=new StringBuilder();
        boolean isPositive=true;
        
        while(idx<s.length() && s.charAt(idx)==' '){
            idx++;
        }
        
        if(s.charAt(idx)=='-'){
            isPositive=false;
            idx++;
        }
        
        while(idx<s.length() && Character.isDigit(s.charAt(idx))){
            sb.append(s.charAt(idx));
            idx++;
        }
        
        if(sb.isEmpty()) return 0;
        try{
        int num=Integer.parseInt(sb.toString());
        if(!isPositive){
            num=num*-1;
        }
        
        return num;
        }
        catch(Exception e){
            if(isPositive){
                return Integer.MAX_VALUE;
            }
            else{
                return Integer.MIN_VALUE;
            }
        }
        
    }
}