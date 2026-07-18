import java.util.*;
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        st.push(num.charAt(0)-'0');
        int c=0,f=0;
        if(num.length()==k)return "0";
        for(int i=1;i<num.length();i++){
                int a=num.charAt(i-1)-'0';
                int b=num.charAt(i)-'0';
                while(c<k&&(!st.isEmpty())&&b<st.peek()){
                        st.pop();
                        
                        c++;
                }
                    st.push(b);
                
        }
        while(c<k){
            st.pop();
            c++;
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        if (i == sb.length())
            return "0";

        return sb.substring(i);
    }
}