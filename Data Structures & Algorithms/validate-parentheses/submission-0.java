

class Solution {
    public Stack<Character> st = new Stack<>();

    public boolean isMatching(char x, char y) {
        if (x == '(' && y == ')') {
            return true;
        } else if (x == '[' && y == ']') {
            return true;
        } else if (x == '{' && y == '}') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } else {
                // A closing bracket cannot match an empty stack
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if (isMatching(top, current)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        // Valid only if no opening brackets remain
        return st.isEmpty();
    }
}