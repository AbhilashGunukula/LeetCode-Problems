class Solution {
    public String intToRoman(int num) {
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i =0;
        String str = new String();

        while(num>0){
            if(num>=numbers[i]){
                str+=strs[i];
                num-=numbers[i];

            }else{
                i++;
            }
        }

        return str;
        
    }
}