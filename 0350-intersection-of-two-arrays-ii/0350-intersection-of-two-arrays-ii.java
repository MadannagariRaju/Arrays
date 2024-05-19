class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // brute force approach
        List<Integer>al = new ArrayList<>();
        int vis[]=new int[nums2.length];
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j] && vis[j]==0) {
                    System.out.println(nums1[i]);
                    al.add(nums1[i]);
                    vis[j]=1;
                    break;
                }
            }
        }
        int res[]= new int[al.size()];
        for(int i=0;i<res.length;i++) {
            res[i]=al.get(i);
        }
        return res;
    }
}