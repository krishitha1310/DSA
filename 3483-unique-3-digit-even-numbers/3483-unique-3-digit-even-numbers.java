class Solution {
    public int totalNumbers(int[] digits) {
        int[] arr=new int[10];
        for(int d:digits){
            arr[d]++;
        }
        int count=0;
        for(int i=100;i<=998;i+=2){
            int r1=i/100;
            int r2=(i/10)%10;
            int r3=i%10;
            int[] req=new int[10];
            req[r1]++;
            req[r2]++;
            req[r3]++;
            if(arr[r1]>=req[r1]&&arr[r2]>=req[r2]&&arr[r3]>=req[r3]){
                count++;
            }
        }
        return count;
    }
}