class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char small='z';
        
        for(char ch:letters){
            if((int)ch>(int)target){
                if((int)ch<(int)small)
                    small=ch;
                

            }
        }
        if(small=='z'){
            return letters[0];
        }
        return small;
    }
}