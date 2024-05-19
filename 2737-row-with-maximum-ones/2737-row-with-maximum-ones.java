class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rn=0, countones=0, maxcount=0;

        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j]==1) {
                    countones++;
                }
                if(countones > maxcount) {
                    maxcount = countones;
                    rn=i;
                }
            }
            countones=0;
        }
        int res[] = new int[2];
        res[0]=rn;
        res[1]=maxcount;
        return res;
    }
}