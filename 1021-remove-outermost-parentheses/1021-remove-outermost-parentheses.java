import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int l=0,r=0;
        int i=0,j=0;
        Queue<Character> qu=new LinkedList<>();
        while(j<s.length()){
            char ch=s.charAt(j);
             if(ch=='('){
                    l++;
                }
                else{
                    r++;
                }
            if(l==r&&l!=0){
                q.poll();
                l=0;
                r=0;
                j++;
                for (Character item : q) {
                    str.append(item);
                 }
                q=new LinkedList<>();
            }
            else{
                q.add(ch);
                j++;
            }
           
        }
        for (Character item : q) {
            str.append(item);
        }
        return str.toString();
    }
}
