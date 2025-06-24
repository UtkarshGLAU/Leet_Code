class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int count=0;
        for(int n:derived) if(n==1) count++;
        return count%2==0;
    }
}