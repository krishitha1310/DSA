class Solution {
    public long sumAndMultiply(int n) {
        String s="";
        int f=0;
        long sum=0;
        String num=Integer.toString(n);
        for(int i=0;i<num.length();i++){
            String tem="";
            tem=tem+num.charAt(i);
            if(!tem.equals("0")){
                f=1;
                s=s+tem;
                sum+=Long.parseLong(tem);
            }
            
        }
        if(f==0) return 0;
        return sum*Long.parseLong(s);

    }
}