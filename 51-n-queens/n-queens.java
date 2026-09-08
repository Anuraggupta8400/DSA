class Solution {
    static boolean isAttackNotPossible(int rowIdx,int colIdx , int n, char[][] board){
        //check left anu queen exist horizontal
        int row = rowIdx;
        int col= colIdx;
        while(col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }
        // check lett upper diagnol
         row = rowIdx;
         col= colIdx;
        while(row>=0&&col>=0){
            if(board[row][col]== 'Q'){
                return false;
            }
            row--;
            col--;
        }
        //check left lower diagnol
         row = rowIdx;
         col= colIdx;
        while(row<n&&col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
 static void chess(char[][] board, int n ,int colIdx,List<List<String>> ans)  {
if(colIdx >= n){//WE GET A VALID ARRANGEMNT ON BOARD SO WE SHOULD ADD INTO ANS IN THE FORMAT OF LIST OF LIST TO BE CHANGE INTO STRING FOR ALL ROW 
      List<String> temp = new ArrayList<>();
    for( int i =0;i<n;i++){
        //create temp list 
     
        temp.add( new String (board[i]));//that step we convert the '.'into string ( Q ) create into list
    }
    ans.add(temp) ;
    return ;
}
//we have to visit all cell  row or col  to place queen solve wit rec
for(int rowIdx = 0;rowIdx<n;rowIdx++){
    if(isAttackNotPossible(rowIdx,colIdx,n,board)){
        board[rowIdx][colIdx] = 'Q';
        chess(board,n,colIdx+1,ans);
        board[rowIdx][colIdx] ='.';
        
    }
}
}
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i =0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int colIdx =0;
        List<List<String>> ans = new ArrayList<>();
        chess(board,n,colIdx,ans);
        return ans;
    }
}