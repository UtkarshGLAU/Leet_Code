class Solution {
    public boolean isPalindrome(String s) {
        String n = s.toLowerCase().replaceAll("[^0-9a-z]","");
        int l=n.length();
        for(int i=0;i<l/2;i++){
            if(n.charAt(i)!=n.charAt(l-1-i)) return false;
        }
        return true;
    }
}