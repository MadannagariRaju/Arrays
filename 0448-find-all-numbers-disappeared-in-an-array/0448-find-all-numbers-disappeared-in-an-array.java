class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>al = new ArrayList<>();
        int res[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++) {
            res[nums[i]]++;
        }
        for(int i=1;i<res.length;i++) {
            if(res[i]==0) {
                al.add(i);
            }
        }
        return al;
    }
}