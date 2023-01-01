import java.util.*;

class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        int a, b;
        for(int i = 0; i<tokens.length; i++) {
            String s = tokens[i];
            switch(s) {
                case "+":
                        a = st.pop();
                        b = st.pop();
                        st.push(a+b);
                        break;
                case "-":
                        a = st.pop();
                        b = st.pop();
                        st.push(b-a);
                        break;
                case "*":
                        a = st.pop();
                        b = st.pop();
                        st.push(a*b);
                        break;
                case "/": 
                        a = st.pop();
                        b = st.pop();
                        st.push(b/a);
                        break;
                default: 
                    st.push(Integer.parseInt(s));
                    break;
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String tokens[] = new String[n];

            for(int i = 0; i<n; i++) {
                    tokens[i] = sc.nextLine();
            }

            System.out.println(evalRPN(tokens));
    }
}
