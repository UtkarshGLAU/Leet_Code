class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for (int x : derived) xor = xor ^ x;
        return xor == 0;
    }
}