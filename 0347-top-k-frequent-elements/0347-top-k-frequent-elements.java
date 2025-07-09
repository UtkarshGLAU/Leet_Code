class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n:nums) hm.put(n,hm.getOrDefault(n,0)+1);
        List<int []> arr = new ArrayList<>();
        for(Map.Entry e:hm.entrySet()){
            arr.add(new int []{(int)e.getKey(),(int)e.getValue()});
        }
        Collections.sort(arr,(a,b)->b[1]-a[1]);
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr.get(i)[0];
        }
        return ans;
    }
}