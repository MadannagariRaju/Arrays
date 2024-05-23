class Solution {
    public int maxSubArray(int[] nums) {
        //Brute force Approach --- TLE
        int maxi=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++) {
        //     for(int j=i;j<nums.length;j++) {
        //         int sum=0;
        //         for(int k=i;k<=j;k++) {
        //             sum+=nums[k];
        //             maxi=Math.max(sum,maxi);
        //         }
        //     }
        // }
        

        //Better Approach --> TLE
        // for(int i=0;i<nums.length;i++) {
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++) {
        //         sum+=nums[j];
        //         maxi=Math.max(sum,maxi);
        //     }
        // }


        //Kadane's Algorithm
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            if(sum>maxi) maxi=sum;
            if(sum<0) sum=0;
        }
        return maxi;
    }
}