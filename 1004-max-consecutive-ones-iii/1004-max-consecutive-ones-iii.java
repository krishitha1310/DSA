class Solution {
    public int longestOnes(int[] nums, int k) {
        int c1 = 0;
        int maxC = Integer.MIN_VALUE;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == 1) {
                c1++;
            }

            while ((j - i + 1) - c1 > k) {
                if (nums[i] == 1) {
                    c1--;
                }
                i++;
            }

            maxC = Math.max(maxC, j - i + 1);
        }

        return maxC;
    }
}