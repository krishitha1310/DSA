import java.util.*;
class Solution {
    public String replaceDigits(String s) {
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                res.append(s.charAt(i));
            } else {
                
                int shift = s.charAt(i) - '0';
                char shiftedChar = (char) (s.charAt(i - 1) + shift);
                res.append(shiftedChar);
            }
        }
        return res.toString();
    }
}