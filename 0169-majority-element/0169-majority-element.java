class Solution {
    public int majorityElement(int[] nums) {
        //Brute force approach
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<n;j++) {
        //         if(nums[i]==nums[j]) {
        //             count++;
        //         }
        //     }
        //     if(count>n/2) {
        //         return nums[i];
        //     }
        // }
        // return 0;

        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e: map.entrySet()) {
            if(e.getValue()>n/2) {
                return e.getKey();
            }
        }
        return 0;
    }
}