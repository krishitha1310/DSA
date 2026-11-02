class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                int val=ch-97;
                sum+=weights[val];
            }
            int rem = sum % 26;
            char ch = (char)('a' + (25 - rem));
            str.append(ch);
        }
        return str.toString();
    }
}