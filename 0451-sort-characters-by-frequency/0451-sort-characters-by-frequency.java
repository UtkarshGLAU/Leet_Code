class Solution {
    public String frequencySort(String s) {
        char arr[] = s.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);

        PriorityQueue<Pair<Character, Integer>> p = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Character, Integer> entry : hm.entrySet())
            p.add(new Pair<>(entry.getKey(), entry.getValue()));

        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < hm.size(); i++) {
            Pair<Character, Integer> cu = p.poll();
            int n = cu.getValue();
            while (n-- > 0) {
                ans.append(cu.getKey());
            }
        }
        return ans.toString();
    }
}