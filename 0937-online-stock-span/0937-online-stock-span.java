class StockSpanner {

    Stack<int[]> myStack;

    public StockSpanner() {
        myStack = new Stack<>();
    }
    
    public int next(int price) {

        int span = 1;
        while(myStack.size()>0 && price >= myStack.peek()[0]){
            span+= myStack.pop()[1];
        }
        myStack.push( new int[]{price, span});

        return span; 
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */