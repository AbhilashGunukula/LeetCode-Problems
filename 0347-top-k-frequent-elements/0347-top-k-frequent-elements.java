class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] list = new ArrayList[nums.length + 1];
        for(int i = 0; i<list.length; i++){
            list[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int frequency = entry.getValue();
            list[frequency].add(entry.getKey());
        } 

        int[] res = new int[k];
        int idx = 0;
        for(int i= list.length-1; i>=0; i--){
            for(int num: list[i]){
                res[idx++] = num;
                if(idx == k){
                    return res;
                }
            }
        }

        return new int[0];


        
    }
}