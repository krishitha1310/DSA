class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[ ] arr=new int[10];
        for(int i=0;i<digits.length;i++){
            arr[digits[i]]++;
        }
        int[] res=new int[500];
        int in=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=100;i<=998;i=i+2){
            Boolean p=true;
            int orig=i;
            hm.clear();
            hm.put(orig%10,hm.getOrDefault(orig%10,0)+1);
            orig/=10;
            hm.put(orig%10,hm.getOrDefault(orig%10,0)+1);
            orig/=10;
            hm.put(orig%10,hm.getOrDefault(orig%10,0)+1);
            orig/=10;
            for(Integer x:hm.keySet()){
                if(hm.get(x)>arr[x]){
                    p=false;
                }
            }
            if(p) res[in++]=i;
        }
        int[] fin=new int[in];
        for(int i=0;i<fin.length;i++){
            fin[i]=res[i];
        }
        return fin;
        
    }
}