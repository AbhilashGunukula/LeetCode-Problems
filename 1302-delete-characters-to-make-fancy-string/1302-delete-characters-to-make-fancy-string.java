class Solution {
    public String makeFancyString(String s) {

        StringBuilder ans = new StringBuilder();

        for(int i=0; i< s.length(); i++){
            int n = ans.length();

            if(n<2 || !(ans.charAt(n - 1) == s.charAt(i) && ans.charAt(n - 2) == s.charAt(i))) {
                ans.append(s.charAt(i));
            }

        }

        return ans.toString();
        
    }
}