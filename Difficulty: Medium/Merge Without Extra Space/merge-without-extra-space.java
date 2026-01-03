class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length;
        int m=b.length;
        int left=n-1;
        int right=0;
        while(left>=0 && right < m)
        {
            if(a[left]>b[right])
            {
                int temp=a[left];
                a[left]=b[right];
                b[right]=temp;
                left--;
                right++;
            }
            else
            {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
