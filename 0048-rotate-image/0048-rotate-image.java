class Solution {
    public void rotate(int[][] matrix) {
        //brute force approach
        int n=matrix.length;
        System.out.println(n);
        int res[][]= new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                res[j][n-1-i]=matrix[i][j];
            }
        }
        // copy res array in matrix array
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j]=res[i][j];
            }
        }
    }
}