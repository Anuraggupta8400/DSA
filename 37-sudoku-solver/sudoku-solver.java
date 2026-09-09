class Solution {
    static boolean findemptycell(char[][] board,int[] emptycell){
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
              
                if(board[i][j]=='.'){
  emptycell[0]=i;
                emptycell[1]=j;
                return true;
                }
            }
        }
        return false;
    }
static boolean issafetoplace(char[][] board,char charValue,int rowindex,int colindex){
    for(int col =0;col<9;col++){
        if(board[rowindex][col]==charValue){
            return false;
        }
    }


    for(int row = 0;row<9;row++){
        if(board[row][colindex]==charValue){
            return false;
        }
    }
      int strow=rowindex-rowindex%3;
      int stcol = colindex-colindex%3;

    for(int i=0;i<3;i++){
        for(int j = 0;j<3;j++){
            int actualrow= strow+i;
            int actualcol =stcol+j;
            if(board[actualrow][actualcol]==charValue){
                return false;
            }
        }
    }
    return true;
}

    static boolean solsudokuhelper(char[][] board){
        int[] emptycell = new int[2];
        if(!findemptycell(board,emptycell)){
            return true;
        }

        int rowindex =emptycell[0];
        int colindex =emptycell[1];

        for(int val = 1;val<=9;val++){
            char charValue = (char)(val+'0');
            if(issafetoplace(board,charValue,rowindex,colindex)){
                board[rowindex][colindex]=charValue;
               if(solsudokuhelper(board)==true){
                return true;
               }
               board[rowindex][colindex]='.';
            }
        }
return false;

    }


    
    public void solveSudoku(char[][] board) {
        solsudokuhelper(board);
    }
}