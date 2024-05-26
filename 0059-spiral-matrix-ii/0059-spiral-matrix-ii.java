class Solution {
    public int[][] generateMatrix(int n) {
        int [][]res= new int[n][n];
        int m=n*n;
        int left=0,right=n-1,top=0,bottom=n-1;
        int k=1;
        while(left<=right && top<=bottom && k<=m) {
                for(int i=left;i<=right;i++) {
            res[top][i]=k;
            k++;
        }
        top++;
        for(int i=top;i<=bottom;i++) {
            res[i][right]=k;
            k++;
        }
        right--;
        if(top<=bottom) {
            for(int i=right;i>=left ;i--) {
                res[bottom][i]=k;
                k++;
            }
            bottom--;
        }
        if(left<=right) {
            for(int i=bottom;i>=top;i--) {
                res[i][left]=k;
                k++;
            }
            left++;
        }
        }
        return res;
    }
}