class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num : nums)
            mp.put(num, mp.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return mp.get(a) - mp.get(b);
        });
        for(int key : mp.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.poll();
        }

        return ans;
    }
}