import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[nums1.length];
        int i=0,j=0,x=0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                res[x++]=nums1[i];
                i++;
            }
            else if(nums1[i]==nums2[j]){
                res[x++]=nums1[i];
                res[x++]=nums2[j];
                i++;
                j++;
            }
            else{
                res[x++]=nums2[j];
                j++;
            }
        }
        if(i<m){
            while(i<m){
                res[x++]=nums1[i];
                i++;
            }
        }
        if(j<n){
           while(j<n){
                res[x++]=nums2[j];
                j++;
            }
        }
        System.arraycopy(res,0,nums1,0,nums1.length);
    }
}