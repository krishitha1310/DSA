import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int ind=0;
        while(ind<tokens.length){
           String s=tokens[ind];
           if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
            int a=st.pop();
            int b=st.pop();
            switch(s){
                case "+":
                    st.push(a+b);
                    ind++;
                    break;
                case "-":
                    st.push(b-a);
                    ind++;
                    break;
                case "*":
                    st.push(a*b);
                    ind++;
                    break;
                case "/":
                    st.push(b/a);
                    ind++;
                    break;

            }
           }
           else{
            st.push(Integer.parseInt(s));
            ind++;
           }
        }
        return st.pop();
    }
}