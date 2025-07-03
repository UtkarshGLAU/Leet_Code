class Solution {
    public int findTheWinner(int n, int k) {
        return solve(n,k)+1;
    }
    int solve(int n,int i){
        return n==1?0:(solve(n-1,i)+i)%n;
    }
}