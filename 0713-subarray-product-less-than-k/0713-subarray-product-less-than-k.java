class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c = 0, i = 0, j = 0;
        int prod = 1;
        if(k<=1){
            return 0;
        }

        while (j < nums.length) {
            prod *= nums[j];

            while (prod >= k) {
                prod /= nums[i];
                i++;
            }

            if (prod < k) {
                c += j - i + 1;
            }

            j++;
        }
        return c;
    }
}