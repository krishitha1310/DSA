class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen = Integer.MIN_VALUE, len = Integer.MIN_VALUE;
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);
            if (hm.get(ch) > 2) {
                while (hm.get(ch) > 2) {
                    char c=s.charAt(i);
                    hm.put(c,hm.get(c)-1);
                    i++;
                }
            }
            len = j - i + 1;
            maxLen = Math.max(maxLen, len);

        }
        return maxLen;
    }
}