class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] arr=new int[grid.length*grid[0].length];
        int x=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[x++]=grid[i][j];
            }
        }
        k=k%arr.length;
        int l=arr.length-k,r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        l=0;r=arr.length-k-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        l=0;r=arr.length-1;
       while(l<r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
       }
        List<List<Integer>> list=new ArrayList<>();
        x=0;
        int len=0;
        while(x<arr.length){
            List<Integer> lis=new ArrayList<>();
            l=0;
            while(l<grid[0].length){
                lis.add(arr[x++]);
                l++;
               
                if(x==arr.length)break;
            } 
            list.add(lis);
       }
       return list;
    }
}