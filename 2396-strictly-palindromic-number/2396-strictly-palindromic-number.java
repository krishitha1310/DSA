class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return palindrome(n);
    }

    public boolean palindrome(int n){
        int orig=n,x=0;
        int[] arr=new int[20];
        while(orig!=1){
            arr[x++]=orig%2;
            orig/=2;
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
        return palindrome(n+1);
    }
}