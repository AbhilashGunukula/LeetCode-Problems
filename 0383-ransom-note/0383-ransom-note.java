class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> memo = new HashMap<>();

        // Populate the memo with characters from magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            memo.put(ch, memo.getOrDefault(ch, 0) + 1); // Increment the count or set to 1 if not present
        }

        // Check each character in ransomNote against the memo
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            // If character is not present or no more left to use, return false
            if (!memo.containsKey(ch) || memo.get(ch) == 0) {
                return false;
            }
            // Decrement the count in memo
            memo.put(ch, memo.get(ch) - 1);
        }
        return true;
        
    }
}