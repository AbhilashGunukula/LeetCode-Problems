class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> memo = new HashMap<>();

        for(String str : strs){
            char[] strToArray = str.toCharArray();

            int[] charCount = new int[26];
            for(char c : strToArray){
                charCount[c - 'a']++;
            }
            //Arrays.sort(strToArray);
            //String sortedString = new String(strToArray);

            String charCountKey = Arrays.toString(charCount);

            if(!memo.containsKey(charCountKey)){
                 memo.put(charCountKey, new ArrayList<>());
            }

            memo.get(charCountKey).add(str);
        }

        return new ArrayList<>(memo.values());
        
    }
}