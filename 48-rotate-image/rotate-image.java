class Solution {
    public void rotate(int[][] matrix) {
        //fist we have  transpose the matrix then we have reverse the row 
        int m =matrix.length;
        int n = matrix[0].length;

          // i have to about the problem in this when we transpose the matrix only digonal one side then other part is already transposed
          for(int i= 0 ; i<m ; i++){
            for(int j= i+1; j<n ;j++){
             int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
          }

        // this  loop will take out for reverse the row
        //reverse the start column and end column

          for(int i = 0; i< m ;i++){
             int  s = 0;
            int   e = matrix[i].length-1;
            while(s< e){
            int temp = matrix[i][s];
             matrix[i][s]= matrix[i][e];
             matrix[i][e] = temp;
             s++;
             e--;
             }
          }
    }
}