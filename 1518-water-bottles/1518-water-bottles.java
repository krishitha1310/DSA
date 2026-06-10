class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk=numBottles,empty=numBottles;
        while(empty>=numExchange){
            int neww=empty/numExchange;
            drunk+=neww;
            empty=neww+(empty%numExchange);
        }
        return drunk;
    }
}