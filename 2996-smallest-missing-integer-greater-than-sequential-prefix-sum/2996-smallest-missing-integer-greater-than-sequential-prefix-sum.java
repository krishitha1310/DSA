class Solution {
    public int missingInteger(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int prefixSum = nums[0];

        for (int n : nums) {
            list.add(n);
        }
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] - nums[i - 1] == 1) {
                prefixSum += nums[i];
            } else {
                break;
            }
        }

        while (true) {
            if (!list.contains(prefixSum)) {
                return prefixSum;
            }
            prefixSum++;
        }

    }
}