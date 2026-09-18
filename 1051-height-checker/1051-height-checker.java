import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int count = 0;
        for (int n : heights) {
            q.add(n);
        }
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != q.poll()) {
                count++;
            }
        }
        return count;
    }
}