class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return palindrome(2,n);
    }

    public boolean palindrome(int orig,int n){
        int x=0,original=orig,temp=n;
        if(orig>(n-2)){
            return true;
        }

        int[] arr=new int[40];
        while(temp>0){
            arr[x++]=temp%orig;
            temp/=orig;
        }
        arr[x]=1;
        int l=0,r=x;
        while(l<r){
            if(arr[l]!=arr[r]){
                return false;
            }
            l++;
            r--;
        }
        return palindrome(original+1,n);
    }
}