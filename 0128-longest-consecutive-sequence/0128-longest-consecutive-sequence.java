import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Check every possible sequence
        for (int num : set) {

            // If there is no previous number, this is the start of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}