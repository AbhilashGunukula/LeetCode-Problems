class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int longSubStringCount = 0;

        HashMap<Character, Integer> memo = new HashMap<>();

        for(int right = 0; right<s.length(); right++){

            if(memo.containsKey(s.charAt(right)) && memo.get(s.charAt(right)) >= left){
                left = memo.get(s.charAt(right))+1;
            }

            memo.put(s.charAt(right), right);

            longSubStringCount = Math.max(longSubStringCount, right - left + 1);
        }

        return longSubStringCount;
        
    }
}