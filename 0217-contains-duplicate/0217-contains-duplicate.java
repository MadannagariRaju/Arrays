class Solution {
    public boolean containsDuplicate(int[] nums) {

        // if array contains only positives +ve's
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++) {
        //     if(nums[i]>max) max = nums[i];
        // }
        // int hash[]=new int[max+1];
        // for(int i=0;i<nums.length;i++) {
        //     hash[nums[i]]++;
        // }
        // for(int i=1;i<hash.length;i++) {
        //     if(hash[i]>1) return true;
        // }
        // return false;

        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e : map.entrySet()) {
            if(e.getValue()>1) {
                return true;
            }
        }
        return false;
    }
}