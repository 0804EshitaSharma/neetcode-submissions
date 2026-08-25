class Solution {
    Stack<Integer> st = new Stack<>();
    public int evalRPN(String[] tokens) {
        for(int i = 0; i < tokens.length; i++){
            String s = tokens[i];
            if (s.equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (s.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            } else if (s.equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}