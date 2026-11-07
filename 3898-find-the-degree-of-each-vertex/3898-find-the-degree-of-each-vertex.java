class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int c=0;
            
           
                for(int j = 0; j < matrix[i].length; j++) {
                c += matrix[i][j];
                }
            
            arr[i]=c;
            
        }
        return arr;
    }
}