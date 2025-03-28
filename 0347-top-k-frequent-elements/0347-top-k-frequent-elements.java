class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> store = new HashMap<>();

        for(int num : nums){
            store.put(num, store.getOrDefault(num,0)+1);
        }

        List<Integer>[] list = new ArrayList[nums.length+1];

        for(int i=0; i<=nums.length; i++){
            list[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : store.entrySet()){
            int count = entry.getValue();
            list[count].add(entry.getKey());
        }

        int [] res = new int[k];
        int idx = 0;
        for(int i=list.length-1; i>=0; i--){
            for(int num : list[i]){
                res[idx] = num;
                idx++;
                if(idx == k) return res;
            }

        }

        return res;
        
    }
}