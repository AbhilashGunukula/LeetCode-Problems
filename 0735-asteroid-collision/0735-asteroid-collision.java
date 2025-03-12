class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> myStack  = new Stack<>();

        for(int i=0; i<asteroids.length; i++){
            int currNum = asteroids[i];

            while(!myStack.isEmpty() && (currNum < 0 && myStack.peek() >0)){
                if(Math.abs(currNum)> Math.abs(myStack.peek())){
                    myStack.pop();
                } else if (Math.abs(currNum)== Math.abs(myStack.peek())){
                    myStack.pop();
                    currNum = 0;
                    break;
                } else{
                    currNum = 0;
                    break;
                }
            }

            if(currNum!=0) myStack.push(currNum);
        }

        int [] myArray = new int[myStack.size()];
        for(int i = myStack.size()-1; i>=0; i--){
            myArray[i] = myStack.pop();
        } 

        return myArray;       
    }
}