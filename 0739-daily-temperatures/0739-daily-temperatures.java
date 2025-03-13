class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];  // Result array initialized to 0
        Stack<Integer> stack = new Stack<>(); // Stack stores indices of temperatures

        for (int i = 0; i < n; i++) {
            // While stack is not empty and current temperature is higher than stack top
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index; // Calculate number of days waited
            }
            stack.push(i); // Push current index onto the stack
        }
        
        return answer;
    }
}
