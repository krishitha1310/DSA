class Solution {
    public int maximumProduct(int[] nums) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        int m3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int n:nums){
            if(n>m1){
                m3=m2;
                m2=m1;
                m1=n;
            }
            else if(n>m2&&n!=m1){
                m3=m2;
                m2=n;
            }
            else if(n>m3&&n!=m2&&n!=m1){
                m3=n;
            }
            if(n<min1){
                min2=min1;
                min1=n;
            }
            else if(n<min2&&n!=min1){
                min2=n;
            }
    }
    return Math.max(min1*min2*m1,m1*m2*m3);
    }
}