import java.math.BigInteger;
class Solution {
    public String convertDateToBinary(String date) {
        String [] arr = date.split("-");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<3;i++){
            ans.append((new BigInteger(arr[i]).toString(2)));
            if(i!=2) ans.append("-");
        }
        return ans.toString();
    }
}