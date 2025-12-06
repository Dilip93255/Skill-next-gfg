class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.keySet().contains(arr[i])){
                m.put(arr[i] , m.get(arr[i])+1);
            }else{
                m.put(arr[i],1);
            }
            if(m.get(arr[i])>n/2)
                return arr[i]; 
        }
        return -1;
    }
}