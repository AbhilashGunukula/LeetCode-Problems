class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> memo = new HashMap<>();

        for(int i=0; i<magazine.length(); i++){
            memo.put(magazine.charAt(i), memo.get(magazine.charAt(i))==null?1:memo.get(magazine.charAt(i))+1);
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(memo.get(ransomNote.charAt(i))== null || memo.get(ransomNote.charAt(i))== 0) return false;
            else{
                memo.put(ransomNote.charAt(i),memo.get(ransomNote.charAt(i))-1);
            }
        }

        return true;
        
    }
}