 /*
    Time Complexity: O(1)
    Space Complexity:O(2^N)

    Where 'N' is the no. of operations performed.
*/



import java.util.*;

public class brute {

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    static class MinStack {

        // Constructor

        Stack<Pair> st;

        MinStack() {
            // Write your code here.
            st = new Stack<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            Pair a;
            if (!st.isEmpty()) {
                int y = st.peek().y;
                if (y > num) {
                    a = new Pair(num, num);
                } else {
                    a = new Pair(num, y);
                }
            } else {
                a = new Pair(num, num);
            }

            st.push(a);
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if (st.isEmpty()) {
                return -1;
            }
            return st.pop().x;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            if (st.isEmpty()) {
                return -1;
            }
            return st.peek().x;
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            if (st.isEmpty()) {
                return -1;
            }
            return st.peek().y;
        }
    }
}
