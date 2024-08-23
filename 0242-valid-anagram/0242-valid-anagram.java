class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> anagrams = new HashMap<>();

        for(char c : s.toCharArray()){
            anagrams.put(c, anagrams.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            anagrams.put(c, anagrams.getOrDefault(c,0)-1);
        }

        for(int val: anagrams.values()){
            if(val!=0){
                return false;
            }
        }

        return true;
    }
}