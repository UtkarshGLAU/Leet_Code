class Solution {
    boolean ans;
    int n;
    int m;
    public boolean exist(char[][] board, String word) {
        ans =false;
        n= board.length;
        m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean vis[][]=new boolean[n][m];
                if(board[i][j]==word.charAt(0)){
                    solve(board,word,1,vis,i,j);
                }
                if(ans) break;
            }
            if(ans) break;
        }
        return ans;
    }
    private void solve(char [][] board,String word,int k,boolean[][]vis,int i,int j){
        vis[i][j]=true;
        if(k==word.length()){
            ans=true;
            return;
        }
        if(i+1<n && !vis[i+1][j] && board[i+1][j]==word.charAt(k)){
            solve(board,word,k+1,vis,i+1,j);
        }
        if(i-1>=0 && !vis[i-1][j] && board[i-1][j]==word.charAt(k)){
            solve(board,word,k+1,vis,i-1,j);
        }
        if(j+1<m && !vis[i][j+1] && board[i][j+1]==word.charAt(k)){
            solve(board,word,k+1,vis,i,j+1);
        }
        if(j-1>=0 && !vis[i][j-1] && board[i][j-1]==word.charAt(k)){
            solve(board,word,k+1,vis,i,j-1);
        }
        vis[i][j]=false;
    }
}