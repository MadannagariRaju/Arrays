class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++) {
            sum+=nums[i];
        }
        // System.out.println(sum);
        int dSum=0;
        for(int i=0;i<n;i++) {
            if(nums[i]<10)
            {
                dSum+=nums[i];
                System.out.println(dSum);
            }
            else{
                int m=nums[i];
                while(m>0) {
                    dSum+=m%10;
                    m=m/10;
                }
            }
        }
        // System.out.println(dSum);
        return sum-dSum;
    }
}