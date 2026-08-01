import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        int sand=0,skip=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            if(temp==sandwiches[sand]){
                sand++;
                skip=0;
            }
            else{
                q.offer(temp);
                skip++;
            }
            if(skip==q.size()){
                return q.size();
            }
        }
        return 0;
    }
}