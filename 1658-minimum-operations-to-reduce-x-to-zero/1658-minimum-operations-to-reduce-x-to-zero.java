class Solution {
    public int minOperations(int[] nums, int x) {
        int i = 0, minLen = Integer.MAX_VALUE, arrSum = 0, sum = 0, f = 0;

        for (i = 0; i < nums.length; i++) {
            arrSum += nums[i];
        }
        if(arrSum<x) return -1;
        if(arrSum==x) return nums.length;

        i = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            while (sum > arrSum - x&&i<=j) {
                sum -= nums[i];
                i++;
            }

            if (sum == arrSum - x) {
                minLen = Math.min(minLen, nums.length - (j - i + 1));
                f = 1;
            }
        }

        if (f == 0 || minLen == 0) {
            return -1;
        } else {
            return minLen;
        }
    }
}