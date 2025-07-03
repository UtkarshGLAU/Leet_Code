class Solution {
    public int findTheWinner(int n, int k) {
        return solve(n,k)+1;
    }
    int solve(int n,int i){
        if(n==1) return 0;
        return (solve(n-1,i)+i)%n;
    }
}