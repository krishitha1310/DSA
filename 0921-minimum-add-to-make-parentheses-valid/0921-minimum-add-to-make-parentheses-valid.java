import java.util.*;
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0,c=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                i++;
                c+=1;
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                    c-=1;
                }
                else{
                    c+=1;
                }
                i++;
            }
        }
        return c;
    }
}