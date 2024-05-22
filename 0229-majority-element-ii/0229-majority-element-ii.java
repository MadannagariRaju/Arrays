class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>al = new ArrayList<>();
        int n= nums.length;
        // for(int i=0;i<n;i++) {
        //     int count=0;
        //     for(int j=0;j<n;j++) {
        //         if(nums[i]==nums[j]) {
        //             count++;
        //         }
        //     }
        //     if(count>n/3) {
        //         if(!al.contains(nums[i]))
        //             al.add(nums[i]);
        //     }
        // }

        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e : map.entrySet()) {
            if(e.getValue() > n/3) {
                al.add(e.getKey());
            }
        }
        return al;
    }
}
