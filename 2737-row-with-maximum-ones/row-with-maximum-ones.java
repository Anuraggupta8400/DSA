class Solution {
      public int[] rowAndMaximumOnes(int[][] matrix) {
        int ones = 0;
        int indx = 0;
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            temp = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    temp++;
                }
            }
            if (ones < temp) {
                ones = temp;
                indx = i;
            }
        }
        return new int[]{ indx, ones };
    }
}