class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int res[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(nums1[i]<=nums2[j]) {
                res[k++]=nums1[i];
                i++;
            }
            else if(nums2[j]<=nums1[i]) {
                res[k++]=nums2[j];
                j++;
            }
            System.out.println(Arrays.toString(res));
        }

        while(i<m) {
            res[k++]=nums1[i];
            i++;
        }
        while(j<n) {
            res[k++]=nums2[j];
            j++;
        }
            for(int ind=0;ind<m+n;ind++) {
                nums1[ind]=res[ind];
            }
            
        }
    }