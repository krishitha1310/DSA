class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)||ch=='('){
                st.push(ch);
                i++;
            }
            else{
                StringBuilder temp=new StringBuilder();
                while(st.peek()!='('){
                    if(!st.isEmpty()){
                    temp.append(st.pop());
                    }
                }
                if(!st.isEmpty())
                st.pop();
                for(int k = 0; k < temp.length(); k++){
                     st.push(temp.charAt(k));
                }
                i++;
            }
        }
        
        StringBuilder res=new StringBuilder();
        for(char x:st){
            res.append(x);
        }
        return res.toString();
    }
}