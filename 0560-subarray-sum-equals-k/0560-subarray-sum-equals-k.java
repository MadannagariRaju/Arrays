class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++) {
            sum=0;
            for(int j=i;j<nums.length;j++) {
                sum=sum+nums[j];
                if(sum==k) {
                    count++;
                }
            }
        }
        return count;

        // HashMap<Integer,Integer>map = new HashMap<>();

        // for(int i=0;i<nums.length;i++) {
        //     sum=sum+nums[i];
        //     if(sum == k) {
        //         count++;
        //     }
        //     int rem = sum-k;
        //     if(map.containsKey(rem)) {
        //         count++;
        //     }
        //     map.put(sum,i);
        // }
        // return count;
    }
}