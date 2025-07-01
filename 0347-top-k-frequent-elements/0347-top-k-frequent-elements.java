class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // PriorityQueue<int []> p = new PriorityQueue<>((a,b)->b[1]-a[1]);
        // for(Map.Entry<Integer,Integer> curr:hm.entrySet()) p.add(new int[]{curr.getKey(),curr.getValue()});
        PriorityQueue<Pair <Integer,Integer>> p = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) p.add(new Pair<>(entry.getKey(), entry.getValue()));
        int [] ans = new int [k];
        for(int i=0;i<k;i++) ans[i]=p.poll().getKey();
        return ans;
    }
}