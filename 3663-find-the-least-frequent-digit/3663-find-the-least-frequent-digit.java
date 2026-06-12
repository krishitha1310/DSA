class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr=new int[10];
        int min=Integer.MAX_VALUE;
        int dig=0;  
        while(n!=0){
            arr[n%10]++;
            n/=10;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min&&arr[i]>0){
                min=arr[i];
                dig=i;
            }
        }
        return dig;
    }
}