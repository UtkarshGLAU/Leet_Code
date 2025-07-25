class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = curr;
        for(int i=1;i<nums.length;i++){
            curr = Math.max(nums[i],curr+nums[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}