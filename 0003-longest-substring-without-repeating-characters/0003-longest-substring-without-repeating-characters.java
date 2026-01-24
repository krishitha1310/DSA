class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256]; 

        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (freq[c] == 1) {
                freq[s.charAt(left)] = 0;
                left++;
            }

            freq[c] = 1;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
