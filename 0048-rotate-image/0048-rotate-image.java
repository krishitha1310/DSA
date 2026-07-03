class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                matrix[i][j]=matrix[i][j]^matrix[j][i];
                matrix[j][i]=matrix[i][j]^matrix[j][i];
                matrix[i][j]=matrix[i][j]^matrix[j][i];
            }
        }
        int k=0;
        while(k<matrix.length){
            int l=0,r=matrix.length-1;
            while(l<r){
                matrix[k][r]=matrix[k][r]^matrix[k][l];
                matrix[k][l]=matrix[k][r]^matrix[k][l];
                matrix[k][r]=matrix[k][r]^matrix[k][l];
                r--;
                l++;
            }
            k++;
        }
        System.out.println(Arrays.toString(matrix));
    }
}