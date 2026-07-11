class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxW=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++){
                wealth+=accounts[i][j];
            }
            maxW=Math.max(wealth,maxW);
        }
        return maxW;
    }
}