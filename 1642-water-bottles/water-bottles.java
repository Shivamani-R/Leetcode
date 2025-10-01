class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles/numExchange>=1){
            int filled=numBottles/numExchange;
            count += filled;
            int remaining=numBottles%numExchange;
            numBottles=filled+remaining;
        }
        return count;
    }
}