import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int sum=0,low=1,high=piles.length-1;
        for(int x:piles){
            high=Math.max(high,x);
        }   
         while(low<high){
            int mid=low+(high-low)/2;
            int hours=0;
            for(int x:piles){
                hours+=(x+mid-1)/mid;
            }
            if(hours<=h){
                high=mid;
            }
            else{
                low=mid+1;
            }
         }
         return low;
    }
}