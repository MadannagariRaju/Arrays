class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // List<Integer>al = new ArrayList<>();
        // for(int i=0;i<nums1.length;i++) {
        //     for(int j=0;j<nums2.length;j++) {
        //         if(nums1[i]==nums2[j] && !al.contains(nums1[i])) {
        //             al.add(nums1[i]);
        //         }
        //     }
        // }
        // int res[]=new int[al.size()];
        // for(int i=0;i<res.length;i++) {
        //     res[i] = al.
        // }
        // return res;


         HashSet<Integer>set = new HashSet<>();
       for(int i=0;i<nums1.length;i++) {
        set.add(nums1[i]);
       }
       HashSet<Integer>hs = new HashSet<>();
       for(int i=0;i<nums2.length;i++) {
           if(set.contains(nums2[i])) {
              hs.add(nums2[i]);
           }
       }
        int res[]=new int[hs.size()];
        int ind=0;
        for(int val : hs) {
            res[ind++]=val;
        }
        return res;
    }
}