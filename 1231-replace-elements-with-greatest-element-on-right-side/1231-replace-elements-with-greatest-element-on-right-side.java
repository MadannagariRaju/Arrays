class Solution {
    public int[] replaceElements(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=n-1;i>=0;i--) {
            int m=arr[i];
            if(i==n-1) {
                arr[i]=-1;
            }else{
                arr[i]=maxi;
            }
            maxi=Math.max(maxi,m);
        }
        return arr;
    }
}