class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(i);
        }
        int time=0;
        while(!q.isEmpty()){
            int p=q.poll();
            time++;
            tickets[p]--;
            if(tickets[p]==0){
                if(p==k){
                    return time;
                }
            }
            else{
                q.offer(p);
            }
        }
        return time;
    }
}