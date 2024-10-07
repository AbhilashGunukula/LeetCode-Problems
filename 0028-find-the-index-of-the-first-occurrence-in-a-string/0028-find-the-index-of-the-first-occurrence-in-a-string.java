class Solution {
    public int strStr(String haystack, String needle) {

        int sLength = haystack.length();
        int subLength = needle.length();

        if (subLength == 0) return 0;

        int i = 0, j=0, k=0;

        while(i<sLength && j<subLength){
            if(haystack.charAt(i)== needle.charAt(j)){
                i++;
                j++;
            }else{
                i = k+1;
                j=0;
                k=i;
            }
        }

        if(subLength==j) return k;
        else return -1;
        
    }
}