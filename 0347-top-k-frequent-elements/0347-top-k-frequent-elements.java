class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>
        (Comparator.comparingInt(Map.Entry::getValue));

        for(  Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size() > k) minHeap.poll();
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = Objects.requireNonNull(minHeap.poll()).getKey();
        }
        
        return res;   


        
    }
}