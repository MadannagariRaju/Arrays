class Solution {
    public void moveZeroes(int[] nums) {

        //Brute force
        // int count=0;
        // for(int i=0;i<nums.length;i++) {
        //     if(nums[i]!=0) count++;
        // }
        // int temp[]= new int[count];
        // int j=0;
        // for(int i=0;i<nums.length;i++) {
        //     if(nums[i]!=0) {
        //         temp[j]=nums[i];
        //         j++;
        //     }
        // }
        // for(int i=0;i<temp.length;i++) {
        //     nums[i]= temp[i];
        // }
        // for(int i=temp.length;i<nums.length;i++) {
        //     nums[i]=0;
        // }

        //optimal
        // we use two pointer approach
        // j-> points to the zero element
        // i-> points to the non- zero element
        // find first jth index which is the starting zero'th element

        int j=-1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0){
               j=i;
               break;  
            } 
        }
        if(j==-1) {
            return ;
        }

        for(int i=j+1;i<nums.length;i++) {
            if(nums[i]!=0) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}