class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int srow = 0 ;
        int erow = m-1; 
        int sCol = 0;
        int eCol = n-1;
         
          while(srow <=erow && sCol <= eCol){
            for(int col = sCol ; col <= eCol; col++ ){
                result.add(matrix[srow][col]);

            }
            srow++;

            for( int row = srow;row <= erow;row++){
                result.add(matrix[row][eCol]);
            }
            eCol--;
            if(srow <=erow){
             for( int col = eCol;col>= sCol;col--){
                result.add(matrix[erow][col]);
             }
             
             erow--;} 
              if(sCol <= eCol){
             for(int row = erow; row>= srow;row--){
                result.add(matrix[row][sCol]);
             }
             sCol++;}
          }
return result;         }}
    
