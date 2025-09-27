///https://leetcode.com/problems/sudoku-solver/

class Solution {
    ArrayList<HashSet<Character>> submatrix = new ArrayList<>();
    ArrayList<HashSet<Character>> cols = new ArrayList<>();
    ArrayList<HashSet<Character>> rows = new ArrayList<>();
    
    public boolean isSudokuValid(char[][] board, int row, int col, char ch){
        // row element
        if(rows.get(row).contains(ch) == true){
            return false;
        }
        
        // column element
        if(cols.get(col).contains(ch) == true){
            return false;
        }
        
        int submatrixIdx = ((row/3) * 3) + (col/3);
        // submatrix element
        if(submatrix.get(submatrixIdx).contains(ch) == true){
            return false;
        }
        
        return true;
    }
    
    public boolean solveSudoku(char[][] board, int row, int col){
        if(row == 9) return true; 
        // positive base case -> all boxes are filled
        
        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col == 8) ? 0 : col + 1;
        int subMatrixIdx = ((row/3) * 3) + (col/3);
            
        if(board[row][col] != '.'){
            // already filled
            boolean res = solveSudoku(board, nextRow, nextCol);
            if(res == true) return true;
            
        } else {
            
            // empty fill -> explore all valid options
            for(int i=1; i<=9; i++){
                if(isSudokuValid(board, row, col, (char)(i + '0')) == true){
                    board[row][col] = (char)(i + '0');
                    rows.get(row).add((char)(i + '0'));
                    cols.get(col).add((char)(i + '0'));
                    submatrix.get(subMatrixIdx).add((char)(i + '0'));
                    
                    boolean res = solveSudoku(board, nextRow, nextCol);
                    if(res == true) return true;
                    
                    rows.get(row).remove((char)(i + '0'));
                    cols.get(col).remove((char)(i + '0'));
                    submatrix.get(subMatrixIdx).remove((char)(i + '0'));
                    
                    board[row][col] = '.';
                }
            }
            
        }
        
        return false; // sudoku is not solvable
    }
    
    public void solveSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            HashSet<Character> hm = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    hm.add(board[i][j]);
                }
            }
            rows.add(hm);
        }
        
        for(int j=0; j<9; j++){
            HashSet<Character> hm = new HashSet<>();
            for(int i=0; i<9; i++){
                if(board[i][j] != '.'){
                    hm.add(board[i][j]);
                }
            }
            cols.add(hm);
        }
        
        
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                HashSet<Character> hm = new HashSet<>();
                for(int ii=0; ii<3; ii++){
                    for(int jj=0; jj<3; jj++){
                        if(board[i + ii][j + jj] != '.'){
                            hm.add(board[i + ii][j + jj]);
                        }
                    }
                }                
                submatrix.add(hm);  
            }
        }
        
        
        solveSudoku(board, 0, 0);
    }
}