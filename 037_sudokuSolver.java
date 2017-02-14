// trap:
// 1 isValid function does not need to check all 9X9 grids

public class Solution {
    public void solveSudoku(char[][] board) {
        solveHelper(board);
    }
    
    private boolean solveHelper(char[][] board) {
        
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                if (board[i][j] == '.') {
                    for (char c='1'; c<='9'; c++) {
                        board[i][j] = c;
                        if (isValid(board))
                            if (solveHelper(board))
                                return true;
                        board[i][j] = '.';
                    }
                    return false;
                    
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] board) {
        
        for (int i=0; i<9; i++) {
            if (rowNoConflict(i, board) && colNoConflict(i, board))
                continue;
            else
                return false;
        }
        for (int i=0;i<9; i=i+3) {
            for (int j=0;j<9;j=j+3) {
                if (gridNoConflict(i, j, board))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
    
    private boolean rowNoConflict(int row, char[][] board) {
        HashSet<Character> set = new HashSet();
        for (int i=0;i<9;i++) {
            if (set.contains(board[row][i])&&board[row][i]!='.')
                return false;
            else
                set.add(board[row][i]);
        }
        return true;
    }
    private boolean colNoConflict(int col, char[][] board) {
        HashSet<Character> set = new HashSet();
        for (int i=0;i<9;i++) {
            if (set.contains(board[i][col])&&board[i][col]!='.')
                return false;
            else
                set.add(board[i][col]);
        }
        return true;
    }
    private boolean gridNoConflict(int x, int y, char[][] board) {
        HashSet<Character> set = new HashSet();
        for(int i=x; i<x+3 ; i++) {
            for (int j=y;j<y+3;j++) {
                if (set.contains(board[i][j])&&board[i][j]!='.')
                    return false;
                else
                    set.add(board[i][j]);
            }
        }
        return true;
    }
    
}