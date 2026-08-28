class Solution {
    public int findPermutationDifference(String s, String t) {

        int[] pos = new int[26];

        // Store the position of each character in s
        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - 'a'] = i;
        }

        int ans = 0;

        // Find the difference in positions
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            ans += Math.abs(pos[ch - 'a'] - i);
        }

        return ans;
    }
}