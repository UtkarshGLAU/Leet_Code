class Solution {
    public int missingNumber(int[] nums) {
        boolean arr [] = new boolean[nums.length+1];
        for(int n:nums) arr[n] = true;
        for(int i=0;i<arr.length;i++) if(!arr[i]) return i;
        return -1;
    }
}