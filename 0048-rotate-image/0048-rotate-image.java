class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int res[][]= new int[n][n];
        // //brute force approach
        // System.out.println(n);
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         res[j][n-1-i]=matrix[i][j];
        //     }
        // }
        // // copy res array in matrix array
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         matrix[i][j]=res[i][j];
        //     }
        // }


        // optimal approach

        //transpose
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println(Arrays.toString(matrix[0]));
        for(int i=0;i<n;i++) {
            swap(matrix[i]);
            System.out.println(matrix[i]);
        }
    }
    public void swap(int a[]) {
        int i=0,j=a.length-1;
        while(i<j)  {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}