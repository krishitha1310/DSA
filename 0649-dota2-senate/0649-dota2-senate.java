import java.util.* ;
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad=new LinkedList<>();
        Queue<Integer> dir=new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            char ch=senate.charAt(i);
            if(ch=='R'){
                rad.offer(i);
            }
            else{
                dir.offer(i);
            }
        }
        while(!rad.isEmpty()&&!dir.isEmpty()){
            int d=dir.poll(),r=rad.poll();
            if(r<d){
                rad.offer(r+senate.length());
            }
            else{
                dir.offer(d+senate.length());
            }
        }
        if(rad.isEmpty())return "Dire";
        return "Radiant";
    }
}
