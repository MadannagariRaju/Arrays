class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>al=new ArrayList<>();
        int n= matrix.length; 
        int m= matrix[0].length;
        System.out.println(n+"  "+m);

        int top=0,bottom=n-1,left=0,right=m-1;

        while(top<=bottom && left<=right) {
                    // moving right
        for(int i=left;i<=right;i++) {
            al.add(matrix[top][i]);
        }
        top++;
        //moving bottom
        for(int i=top;i<=bottom;i++) {
            al.add(matrix[i][right]);
        }
        right--;
        //moving left
        if(top<=bottom) {
            for(int i=right;i>=left;i--) {
                al.add(matrix[bottom][i]);
            }
            bottom--;
        }
        //moving top
        if(left<=right) {
            for(int i=bottom;i>=top;i--) {
                al.add(matrix[i][left]);
            }
            left++;
        }
        }

        return al;
    }
}