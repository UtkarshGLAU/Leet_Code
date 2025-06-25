class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] keypad = {
                { 'a', 'b', 'c' }, 
                { 'd', 'e', 'f' }, 
                { 'g', 'h', 'i' }, 
                { 'j', 'k', 'l' }, 
                { 'm', 'n', 'o' },
                { 'p', 'q', 'r', 's' },
                { 't', 'u', 'v' },
                { 'w', 'x', 'y', 'z' }
        };
        char [][] selected = new char[digits.length()][];
        for(int i=0;i<selected.length;i++)  selected[i]=keypad[Integer.parseInt(digits.charAt(i)+"")-2];
        List<String> ans=new ArrayList<>();
        if(selected.length==0) return new ArrayList<>();
        backtrack(selected,0,new StringBuilder(), ans);
        return ans;
    }

    private void backtrack(char[][] selected, int idx, StringBuilder current, List<String> ans) {
        if (idx == selected.length) {
            ans.add(current.toString());
            return;
        }

        for (char c : selected[idx]) {
            current.append(c);
            backtrack(selected, idx + 1, current, ans);
            current.deleteCharAt(current.length() - 1);
        }
    }
}