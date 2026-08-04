class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0, temp = i;
            while (temp > 0) {
                count+=temp%2;
                temp /= 2;
            }
            arr[i] = count;
        }
        return arr;
    }
}