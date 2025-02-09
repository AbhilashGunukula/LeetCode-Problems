class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> memo = new HashMap<>();

        for(String str : strs){
            char[] strToArray = str.toCharArray();
            Arrays.sort(strToArray);
            String sortedString = new String(strToArray);

            if(!memo.containsKey(sortedString)){
                 memo.put(sortedString, new ArrayList<>());
            }

            memo.get(sortedString).add(str);
        }

        return new ArrayList<>(memo.values());
        
    }
}