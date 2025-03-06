class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxCount = 0; int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right =0; right<s.length(); right++){
            Character currentChar = s.charAt(right);

            map.put(currentChar, map.getOrDefault(currentChar, 0)+1);

            maxCount = Math.max(maxCount, map.get(currentChar));

            if ((right - left + 1) - maxCount > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);

        }

        return maxLength;
        
    }
}