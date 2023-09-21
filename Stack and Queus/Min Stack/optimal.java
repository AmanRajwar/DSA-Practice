 /*
    Time Complexity: O(1)
    Space Complexity:O(N)

    Where 'N' is the no. of operations performed.
*/

import java.util.*;


public class optimal {

    static class MinStack {

        // Constructor
        Stack<Long> st;
        Long min;

        MinStack() {
            // Write your code here.
            st = new Stack<>();
            min = Long.MAX_VALUE;
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            if (st.isEmpty()) {
                st.push(Long.valueOf(num));
                min = Long.valueOf(num);
            } else {
                if (num < min) {
                    Long val = 2 * num - min;
                    st.push(val);
                    min = Long.valueOf(num);
                } else {
                    st.push(Long.valueOf(num));
                }
            }
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if (st.isEmpty()) {

                return -1;
            } else {
                Long val = st.pop();
                if (val < min) {
                    Long ans = min;
                    min = 2 * min - val;
                    return ans.intValue();
                } else {
                    return val.intValue();
                }
            }
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            if (st.isEmpty()) {

                return -1;
            } else {
                Long val = st.peek();
                if (val < min) {

                    return min.intValue();
                } else {
                    return val.intValue();
                }
            }
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            if (st.isEmpty()) {
                return -1;
            } else {
                return min.intValue();
            }
        }
    }
}