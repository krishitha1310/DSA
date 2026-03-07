class Solution {
    public int thirdMax(int[] nums) {
        long m1=Long.MIN_VALUE;
        long m2=Long.MIN_VALUE;
        long m3=Long.MIN_VALUE;
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
    }
    if(m3!=Long.MIN_VALUE){
        return (int)m3;
    }
    else {
    return (int)m1;
}}}