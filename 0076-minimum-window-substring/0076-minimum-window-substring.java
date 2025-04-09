class Solution {
    public String minWindow(String s, String t) {

        int[] frequency = new int[128];
        for(char c : t.toCharArray()){
            frequency[c]++;
        }

        int left =0;
        int right =0;
        int minLength = Integer.MAX_VALUE;
        int minStart =0;
        int required = t.length();

        while(right<s.length()){
            char rChar = s.charAt(right);
            if(frequency[rChar] > 0) required--;
            frequency[rChar]--;
            right++;

            while(required == 0){
                if(right - left <= minLength){
                    minLength = right-left;
                    minStart = left;
                }

                char lChar = s.charAt(left);
                frequency[lChar]++;
                if(frequency[lChar]>0) required++;
                left++;
            }

        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart+minLength); 
        
    }
}