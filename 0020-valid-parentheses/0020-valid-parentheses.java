class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int c=0;
        if(s.length()%2!=0)
        return false;
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']')
        return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
                st.push(ch);
            }
            else if(ch=='}'){
                c++;
                 if(st.size()==0)
                 return false;
                if(st.peek()!='{')
                    return false;
                 
                if(st.size()!=0)
                st.pop();
            }
            else if(ch==']'){
                c++;
                 if(st.size()==0) return false;
                if(st.peek()!='[')
                    return false;
                 
                     if(st.size()!=0)
                st.pop();
            }
            else if(ch==')'){
                c++;
                 if(st.size()==0) return false;
                if(st.peek()!='(')
                    return false;
                 
                 if(st.size()!=0)
                st.pop();
            }
        }
        if(c==0){
            return false;
        }
        if(st.size()!=0) return false;
        return true;
    }
}