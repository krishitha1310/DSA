import java.util.*;

class Solution {
    int f = 0;

    public int pivot(int[] nums, int len) {
        if (len == 0) {
            return 0;
        }
        for (int temp = len - 1; temp >= 0; temp--) {
            if (nums[temp] < nums[temp + 1]) {
                f = 1;
                return temp;
            }
        }
         return pivot(nums, len - 1);
        
    }

    public void nextPermutation(int[] nums) {
        int ind1 = pivot(nums, nums.length - 1);
        if (f == 1) {
            int j = nums.length - 1;

            while (nums[j] <= nums[ind1]) {
                j--;
            }

            int temp = nums[ind1];
            nums[ind1] = nums[j];
            nums[j] = temp;

            int l = ind1+1, r = nums.length - 1;
            while (l <= r) {
                temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            System.out.println(Arrays.toString(nums));
        } else {
            Arrays.sort(nums);
            System.out.println(nums);
        }

    }
}