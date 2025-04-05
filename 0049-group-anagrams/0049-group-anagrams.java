class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> memo = new HashMap<>();

        for(String str : strs){

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            if(!memo.containsKey(sortedKey)){
                memo.put(sortedKey, new ArrayList<String>());
            }

            memo.get(sortedKey).add(str);


        }

        return new ArrayList<>(memo.values());

        
    }
}