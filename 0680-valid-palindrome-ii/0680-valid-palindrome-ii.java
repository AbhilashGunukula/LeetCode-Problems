class Solution {
    public boolean validPalindrome(String s) {
        int i =0 , j=s.length()-1;
        while(i<j){
            if(s.charAt(i)== s.charAt(j)){
                i++; j--;
            } else {
               return isPalindrome(i+1, j, s) || isPalindrome(i, j-1, s);
            }
        }
        return true;       
    }
    private boolean isPalindrome(int left, int right, String s){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) {return false;}
            left++;
            right--;
        }
        return true;
    }


}