class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> myStack = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i<n; i++){
            while(!myStack.isEmpty() && temp[i]>temp[myStack.peek()]){
                int index = myStack.pop();
                ans[index] = i-index;

            }
            myStack.push(i);
        }

        return ans;


    }
}
