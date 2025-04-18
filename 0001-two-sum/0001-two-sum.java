class Solution {
    public int[] twoSum(int[] nums, int target) {

        //brute force approach
        int res[]=new int[2];
        int n=nums.length;
        // for(int i=0;i<n;i++) {
        //     for(int j=i+1;j<n;j++) {
        //         if(nums[i]+nums[j]==target) {
        //             res[0]=i;
        //             res[1]=j;
        //             break;
        //         }
        //     }
        // }
        // return res;


        //Better approach

        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++) {
            int rem = target-nums[i];
            if(map.containsKey(rem)) {
                res[0]=i;
                res[1]=map.get(rem);
            }
            map.put(nums[i],i);
        }
        return res;

    }
}