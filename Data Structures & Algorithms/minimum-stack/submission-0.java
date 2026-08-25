class MinStack {

    private static class Node {
        int value;
        int min;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    Stack<Node> st;


    public MinStack() {
        this.st = new Stack<Node>();
    }
    
    public void push(int val) {
         int currentMin;
        if(st.isEmpty()){
            currentMin = val;

        }else{
           currentMin = Math.min(val,st.peek().min);
        }
        this.st.push(new Node(val,currentMin));
        
    }
    
    public void pop() {
        st.pop();
        
    }
    
    public int top() {
        return st.peek().value;
    }
    
    public int getMin() {

        return st.peek().min;
    }
}
