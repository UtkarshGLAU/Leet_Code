class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int p=-1,q=-1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(p==-1 && isPrime(nums[i])) p=i;
            if(q==-1 && isPrime(nums[n-1-i])) q=n-1-i;
        }
        return q-p;
    }
    boolean isPrime(int n){
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}