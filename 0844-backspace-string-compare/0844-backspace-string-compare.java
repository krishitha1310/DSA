class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> st1=new Stack<>();
        Stack<String> st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(st1.size()!=0)
                st1.pop();
            }

            else{
                String temp="";
                temp+=s.charAt(i);
                st1.push(temp);
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(st2.size()!=0)
                st2.pop();
            }
            else{
                String temp="";
                temp+=t.charAt(i);
                st2.push(temp);
            }
        }
        if(st1.equals(st2))
            return true;
    return false;
    }
}