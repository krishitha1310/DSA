class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length * matrix[0].length];
        int[] col = new int[matrix.length * matrix[0].length];
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[x] = i;
                    col[x] = j;
                    x++;
                }
            }
        }
        int ind = 0;
        for (int k = 0; k < x; k++) {
            //complete row change
            for (int l = 0; l < matrix[row[ind]].length; l++) {
                matrix[row[k]][l] = 0;
            }

            //complete column change
            for (int m = 0; m < matrix.length; m++) {
                matrix[m][col[k]] = 0;
            }

        }
        System.out.println(Arrays.toString(matrix));
    }
}