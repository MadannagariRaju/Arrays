class Solution {
    public int arraySign(int[] nums) {
        int p=1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                return 0;
            }
            else if(nums[i]<0) {
                p=p*-1;
            }
        }
        return p;
    }
}