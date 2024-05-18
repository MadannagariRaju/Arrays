class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]= new int[nums.length];
        int i=0,j=n,k=0;
        while(i<=j && j<=nums.length-1) {
            if(k%2==0){
                res[k]=nums[i];
                i++;
            }
            else if(k%2!=0) {
                res[k]=nums[j];
                j++;
            }
            k++;
        }
        return res;
    }
}