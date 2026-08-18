class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow = matrix.length;
        int totalcol = matrix[0].length;
         //isme hmne target ko search krne ke liye pointer ko starting row &endiing col ko chhose kiya h 
          int row = 0;
          int col = totalcol-1;
          while(row < totalrow && col >=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){//agar target less than h current idx ke to col ko -- kr dege left side move to left
            col--;
    }
    else{
        row++;//bottom move krne ke liye because up bottom side value is greater than current idx
    }



} 
 return false;}}