class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Long> numbers = new Stack<>();

        for(int i =0; i<tokens.length; i++){
            if(tokens[i].length() == 1 && tokens[i].charAt(0) < 48){
                long value2 = numbers.pop();
                long value1 = numbers.pop();
                numbers.push(doTheOperation(value1, value2, tokens[i].charAt(0)));
               } else {
                numbers.push(Long.parseLong(tokens[i]));
            }
            
        }

        return numbers.pop().intValue();
        
    }

    long doTheOperation(long value1, long value2, char operator){
        if(operator == '+') return value1 + value2;
        else if(operator == '-') return value1 - value2;
        else if(operator == '*') return value1 * value2;
        else return value1/value2;
    }
}