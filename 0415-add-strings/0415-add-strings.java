class Solution {
    public String addStrings(String num1, String num2) {
        int size1=num1.length()-1,size2=num2.length()-1;
        StringBuilder s=new StringBuilder();
        int car=0;
        
        while(size1>=0||size2>=0){
            int s1=0,s2=0;
            if(size1>=0)
               s1 = num1.charAt(size1) - '0';
              if(size2>=0)
            s2 = num2.charAt(size2) - '0';
              
              int sum=s1+s2+car;
              
                car=sum/10;
                sum=sum%10;
              
              s.append(sum);
              size1--;
              size2--;
          }
          if(car!=0){
            s.append(car);
          }
          return s.reverse().toString();
    }
}