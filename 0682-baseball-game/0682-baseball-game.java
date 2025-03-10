class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> myStack = new Stack<>();

        for(int i =0; i<operations.length; i++){
            if(operations[i].equals("C")) myStack.pop();
            else if (operations[i].equals("+")) {
                int top = myStack.pop();  // Pop the last score
                int newTop = myStack.peek() + top;  // Sum the last two scores
                myStack.push(top);  // Push the original score back
                myStack.push(newTop);
            }
            else if (operations[i].equals("D")) myStack.push(2 * myStack.peek());
            else myStack.push(Integer.parseInt(operations[i]));
        }

        int result = 0;

        while(!myStack.isEmpty()){
            result += myStack.pop();
        }

        return result;
        
    }
}